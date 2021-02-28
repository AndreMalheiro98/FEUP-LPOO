import com.googlecode.lanterna.SGR;
import com.googlecode.lanterna.TerminalPosition;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.graphics.TextGraphics;

public class Wall extends Element{
    private String wallCharacter;

    public Wall(int x,int y,String str){
        super(x,y);
        this.wallCharacter=str;
    }

    public String getWallCharacter() {
        return wallCharacter;
    }
}
