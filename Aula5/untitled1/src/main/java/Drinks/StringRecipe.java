package Drinks;

import java.util.List;

public class StringRecipe {
    List<StringTransformer> transformers;
    public StringRecipe(List<StringTransformer> transformers ){
        this.transformers=transformers;
    }

    public void mix(StringDrink drink){
        for(StringTransformer tranformer : this.transformers){
            tranformer.execute(drink);
        }
    }

}
