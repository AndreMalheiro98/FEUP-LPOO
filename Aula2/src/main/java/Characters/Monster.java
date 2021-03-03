package Characters;

import Primitives.*;

public class Monster extends Element {

    public Monster(int x,int y){
        super(x,y);
    }

    public Position move(Position heroPosition){
        int horizontalDistance,verticalDistance;
        horizontalDistance=heroPosition.getX()-this.getPosition().getX();
        verticalDistance=heroPosition.getY()-this.getPosition().getY();
        Position newMonsterPosition;
        if(Math.abs(horizontalDistance)>Math.abs(verticalDistance)){
            if(horizontalDistance>0)
                newMonsterPosition=new Position(this.getPosition().getX()+1,this.getPosition().getY());
            else
                newMonsterPosition=new Position(this.getPosition().getX()-1,this.getPosition().getY());
        }else{
            if(verticalDistance>0)
                newMonsterPosition=new Position(this.getPosition().getX(),this.getPosition().getY()+1);
            else
                newMonsterPosition=new Position(this.getPosition().getX(),this.getPosition().getY()-1);
        }
        return newMonsterPosition;
    }
}

