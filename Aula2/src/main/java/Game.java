import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.TextCharacter;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.screen.TerminalScreen;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;

import java.io.IOException;

public class Game {
    /*-----------------------------Class Variables-----------------------------*/
    private Screen screen;

    /*-----------------------------Class constructor---------------------------*/
    public Game(){
        try {
            TerminalSize terminalSize = new TerminalSize(50, 30);
            DefaultTerminalFactory terminalFactory = new DefaultTerminalFactory().setInitialTerminalSize(terminalSize);
            Terminal terminal = terminalFactory.createTerminal();
            this.screen=new TerminalScreen(terminal);

            this.screen.setCursorPosition(null);   // we don't need a cursor
            this.screen.startScreen();             // screens must be started

            this.screen.doResizeIfNecessary();     // resize screen if necessary

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    /*-----------------------Class Functions----------------------------------*/
    private void draw() throws IOException{
            this.screen.clear();
            this.screen.setCharacter(10, 10, TextCharacter.fromCharacter('X')[0]);
            this.screen.refresh();
    }

    public void run(){
        try{
            this.draw();
        }catch (IOException err){
            err.printStackTrace();
        }
    }

}
