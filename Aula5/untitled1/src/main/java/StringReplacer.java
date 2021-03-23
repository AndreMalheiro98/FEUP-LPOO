public class StringReplacer implements StringTransformer{
    char oldChar,newChar;


    public StringReplacer(char c1,char c2){
        this.oldChar=c1;
        this.newChar=c2;
    }
    @Override
    public void execute(StringDrink drink) {
        drink.setText(drink.getText().replace(this.oldChar,this.newChar));
    }
}
