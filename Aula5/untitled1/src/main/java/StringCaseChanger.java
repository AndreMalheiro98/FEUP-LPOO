public class StringCaseChanger implements StringTransformer{

    @Override
    public void execute(StringDrink drink) {
        StringBuilder finalWord= new StringBuilder();
        for(int i=0;i<drink.getText().length();i++){
            if(Character.isLowerCase(drink.getText().charAt(i)))
                finalWord.append(Character.toUpperCase(drink.getText().charAt(i)));
            else
                finalWord.append(Character.toLowerCase(drink.getText().charAt(i)));
        }
        drink.setText(finalWord.toString());
    }
}
