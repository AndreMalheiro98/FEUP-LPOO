import java.util.List;

public abstract class PizzaCertifier {
    private Pizza pizza;

    public PizzaCertifier(List<Ingredient> ingredients){
        this.pizza=new MediumPizza();
        for(Ingredient auto : ingredients)
            pizza.addIngredient(auto);
    }

    public boolean isCertified(Pizza newPizza){
        return this.pizza.equals(newPizza);
    }
}
