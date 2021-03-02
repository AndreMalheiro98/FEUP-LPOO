package Items;

import Primitives.Element;

public class Coin extends Element {

    private String elementCharacter;
    public Coin(int x,int y,String c){
        super(x,y);
        elementCharacter= c;
    }

    public String getElementCharacter() {
        return elementCharacter;
    }


}
