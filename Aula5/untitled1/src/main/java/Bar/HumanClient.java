package Bar;

import Drinks.StringDrink;
import Drinks.StringRecipe;

public class HumanClient implements Client{

    public HumanClient(){
    }

    @Override
    public void wants(StringDrink drink, StringRecipe recipe,StringBar bar) {
        System.out.println("ANOTHER ROUND");
    }

    @Override
    public void happyHourStarted(Bar bar) {
        System.out.println("THE PARTY's JUST GETTING STARTED!");
    }

    @Override
    public void happyHourEnded(Bar bar) {
        System.out.println("I'm fine for now");
    }
}
