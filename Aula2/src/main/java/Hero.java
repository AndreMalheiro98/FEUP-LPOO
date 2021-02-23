import com.googlecode.lanterna.TextCharacter;
import com.googlecode.lanterna.input.KeyStroke;
import com.googlecode.lanterna.screen.Screen;

public class Hero {
    /*--------------------Hero Variables and Setters/Getters/Constructor---------------*/
    Position position;

    public Hero(int x, int y) {
        this.position=new Position(x,y);
    }

    /*----------------------Hero functions---------------------*/
    public void draw(Screen screen){
        screen.setCharacter(this.position.getX(), this.position.getY(), TextCharacter.fromCharacter('X')[0]);
    }

    private void setPosition(Position position){
        this.position=position;
    }

    public void moveHero(Position position){
        this.setPosition(position);
    }

    public Position moveUp(){
        return new Position(this.position.getX(),this.position.getY()-1);
    }

    public Position moveDown() {
        return new Position(this.position.getX(),this.position.getY()+1);
    }

    public Position moveRight() {
        return new Position(this.position.getX()+1,this.position.getY());
    }

    public Position moveLeft() {
        return new Position(this.position.getX()-1,this.position.getY());
    }
}