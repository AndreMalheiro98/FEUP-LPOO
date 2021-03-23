package Bar;

import Drinks.StringDrink;
import Drinks.StringRecipe;

public interface Client extends BarObserver{
    void wants(StringDrink drink, StringRecipe recipe, StringBar bar);
}

