package Drinks;

import javax.print.DocFlavor;

public class StringDrink {
    String text;
    public StringDrink(String drink){
        this.text=drink;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
