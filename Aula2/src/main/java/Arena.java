import com.googlecode.lanterna.TerminalPosition;
import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.graphics.TextGraphics;
import com.googlecode.lanterna.input.KeyStroke;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Arena {
    private int width,height;
    private Hero hero;
    private List<Wall> walls;
    private List<Coin> coins;

    public Arena(int height,int width){
        this.width=width;
        this.height=height;
        this.hero=new Hero(this.width/2,this.height/2);
        this.walls=createWalls();
        this.coins=createCoins();
    }

    private List<Wall> createWalls(){
        List<Wall> walls= new ArrayList<>();

        for(int c=0;c<this.width;c++){
            walls.add(new Wall(c,0,"_"));
            walls.add(new Wall(c,this.height-1,"-"));
        }

        for(int c=1;c<this.height-1;c++){
            walls.add(new Wall(0,c,"|"));
            walls.add(new Wall(this.width-1,c,"|"));
        }
        return walls;
    }

    private List<Coin> createCoins(){
        Random random= new Random();
        ArrayList<Coin> coins=new ArrayList<>();
        for(int i=0;i<5;i++){
            Position position= new Position(random.nextInt(width -2)+1,random.nextInt(height - 2)+1);
            if(position.equals(this.hero.getPosition())) {
                i--;
                continue;
            }
            Coin coin= new Coin(position.getX(), position.getY(),"$");
            if(coins.contains(coin)){
                i--;
                continue;
            }
            coins.add(coin);
        }

        return  coins;
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
        this.hero.draw(graphics,"#FFFF33","X");
        for(Wall wall: walls)
            wall.draw(graphics,"#FFFFFF",wall.getWallCharacter());
        for(Coin coin: coins)
            coin.draw(graphics,"#FF0000",coin.getElementCharacter());
    }

    public void moveHero(Position position){
        if(canHeroMove(position)) {
            if(takesCoin(position))
                System.out.println("Will add a point");
            this.hero.setPosition(position);
        }

    }

    private boolean canHeroMove(Position position){
        for(Wall wall : this.walls){
            if(wall.getPosition().equals(position))
                return false;
        }

        return true;
    }

    private boolean takesCoin(Position position){
        Coin p;
        for(Coin coin: coins){
            if(coin.getPosition().equals(position)) {
                coins.remove(coin);
                return true;
            }
        }
        return false;
    }

    public int getWidth(){
        return  this.width;
    }

    public int getHeight() {
        return this.height;
    }
}
