package Drinks;

import java.util.List;

public class StringTransformerGroup implements StringTransformer{
    List<StringTransformer> transformersList;

    public StringTransformerGroup(List<StringTransformer> transformers){
        this.transformersList=transformers;
    }

    @Override
    public void execute(StringDrink drink) {
        for(StringTransformer transformer: this.transformersList)
            transformer.execute(drink);
    }
}
