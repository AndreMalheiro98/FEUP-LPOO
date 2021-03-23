package Drinks;

public class StringInverter implements StringTransformer{

    public void execute(StringDrink drink) {
        StringBuilder aux=new StringBuilder(drink.getText());
        drink.setText(aux.reverse().toString());
    }
}
