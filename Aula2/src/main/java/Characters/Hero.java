package Characters;

import Primitives.Element;
import Primitives.Position;

public class Hero extends Element {
    /*--------------------Characters.Hero Variables and Setters/Getters/Constructor---------------*/

    public Hero(int x, int y) {
        super(x,y);
    }

    /*----------------------Characters.Hero functions---------------------*/
    public void moveHero(Position position){
        this.setPosition(position);
    }

    public Position moveUp(){
        return new Position(getPosition().getX(),getPosition().getY()-1);
    }

    public Position moveDown() {
        return new Position(getPosition().getX(),getPosition().getY()+1);
    }

    public Position moveRight() {
        return new Position(getPosition().getX()+1,getPosition().getY());
    }

    public Position moveLeft() {
        return new Position(getPosition().getX()-1,getPosition().getY());
    }
}
