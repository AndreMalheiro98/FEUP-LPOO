import com.googlecode.lanterna.TerminalPosition;
import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.graphics.TextGraphics;
import com.googlecode.lanterna.input.KeyStroke;

import java.io.IOException;

public class Arena {
    private int width,height;
    private Hero hero;
    public Arena(int height,int width){
        this.width=width;
        this.height=height;
        this.hero=new Hero(this.width/2,this.height/2);
    }

    public int processKey(KeyStroke key) throws IOException {
        switch (key.getKeyType()){
            case ArrowLeft:
                this.moveHero(this.hero.moveLeft());
                break;
            case ArrowRight:
                this.moveHero(this.hero.moveRight());
                break;
            case ArrowUp:
                this.moveHero(this.hero.moveUp());
                break;
            case ArrowDown:
                this.moveHero(this.hero.moveDown());
                break;
            case Character:
                return -2;
            case EOF:
                return -1;
            default:
                break;
        }
        return 0;
    }

    public void draw(TextGraphics graphics){
        graphics.setBackgroundColor(TextColor.Factory.fromString("#336699"));
        graphics.fillRectangle(new TerminalPosition(0,0),new TerminalSize(this.getWidth(),this.getHeight()),' ');
        this.hero.draw(graphics);
    }

    public void moveHero(Position position){
        if(canHeroMove(position))
            this.hero.setPosition(position);
    }

    private boolean canHeroMove(Position position){
        if(position.getX()>=0 && position.getX()<this.width && position.getY()>=0 && position.getY()<this.height)
            return  true;
        return false;
    }

    public int getWidth(){
        return  this.width;
    }

    public int getHeight() {
        return this.height;
    }
}
