import java.util.List;

public abstract class Recipe {
    public List<Ingredient> ingredients;

    public Recipe(List<Ingredient> ingredientList){
        this.ingredients=ingredientList;
    }

    public Pizza makeMediumPizza(){
        Pizza newPizza=new MediumPizza();

        for(Ingredient ingredient: ingredients)
            newPizza.addIngredient(ingredient);

        return newPizza;
    }

}
