package Areas;

import Primitives.Element;

public class Wall extends Element {
    private String wallCharacter;

    public Wall(int x,int y,String str){
        super(x,y);
        this.wallCharacter=str;
    }

    public String getWallCharacter() {
        return wallCharacter;
    }
}
