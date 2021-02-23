import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.TextCharacter;
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
    private Hero hero;

    /*-----------------------------Class Variables Setters and Getters---------*/
        public boolean getRunTime(){
            return this.runTime;
        }
        public void setRunTime(boolean bool){
            this.runTime=bool;
        }
    /*-----------------------------Class constructor---------------------------*/
    public Game(){
        this.hero=new Hero(10,10);
        this.runTime=true;
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
            KeyStroke key= screen.readInput();
            this.processKey(key);
            this.hero.draw(this.screen);
            this.screen.refresh();
    }

    private void processKey(KeyStroke key) throws IOException {
        switch (key.getKeyType()){
            case ArrowLeft:
                this.hero.moveHero(this.hero.moveLeft());
                break;
            case ArrowRight:
                this.hero.moveHero(this.hero.moveRight());
                break;
            case ArrowUp:
                this.hero.moveHero(this.hero.moveUp());
                break;
            case ArrowDown:
                this.hero.moveHero(this.hero.moveDown());
                break;
            case Character:
                if(key.getCharacter()=='q')
                    this.screen.close();
                break;
            case EOF:
                this.setRunTime(false);
                break;
            default:
                break;
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
