package Primitives;

import com.googlecode.lanterna.SGR;
import com.googlecode.lanterna.TerminalPosition;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.graphics.TextGraphics;

public class Element {
    private Position position;

    public Element(int x,int y){
        this.position=new Position(x,y);
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position){
        this.position=position;
    }

    public void draw(TextGraphics graphics,String colorValue,String elementCharacter){
        graphics.setForegroundColor(TextColor.Factory.fromString(colorValue));
        graphics.enableModifiers(SGR.BOLD);
        graphics.putString(new TerminalPosition(position.getX(), position.getY()),elementCharacter);
    }
}
