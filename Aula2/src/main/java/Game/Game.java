package Game;

import Areas.Arena;
import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.screen.TerminalScreen;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;
import com.googlecode.lanterna.input.KeyStroke;

import java.io.IOException;

public class Game {
    /*-----------------------------Class Variables-----------------------------*/
    private Screen screen;
    private boolean runTime;
    private Arena arena;

    /*-----------------------------Class Variables Setters and Getters---------*/
        public boolean getRunTime(){
            return this.runTime;
        }
        public void setRunTime(boolean bool){
            this.runTime=bool;
        }
    /*-----------------------------Class constructor---------------------------*/
    public Game(){
        this.arena=new Arena(25,25);
        this.runTime=true;

        try {
            int width=50,height=30;
            TerminalSize terminalSize = new TerminalSize(width, height);
            DefaultTerminalFactory terminalFactory = new DefaultTerminalFactory().setInitialTerminalSize(terminalSize);
            Terminal terminal = terminalFactory.createTerminal();
            this.screen=new TerminalScreen(terminal);

            this.screen.setCursorPosition(null);   // we don't need a cursor
            this.screen.startScreen();             // screens must be started

            this.screen.doResizeIfNecessary();     // resize screen if necessary
            this.arena.draw(screen.newTextGraphics());
            this.screen.refresh();

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    /*-----------------------Class Functions----------------------------------*/
    private void draw() throws IOException{
            this.screen.clear();
            KeyStroke key= screen.readInput();
            int aux=this.arena.processKey(key);
            if(aux==-1)
                this.setRunTime(false);
            else if(aux==-2)
                this.screen.close();
            else{
                this.arena.draw(screen.newTextGraphics());
                this.screen.refresh();
            }
    }



    public void run(){
        while(this.getRunTime()){
            try{
                this.draw();
            }catch (IOException err){
                err.printStackTrace();
            }
        }

    }

}
