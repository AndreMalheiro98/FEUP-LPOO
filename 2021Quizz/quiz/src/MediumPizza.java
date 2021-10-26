import java.util.ArrayList;
import java.util.List;

public class MediumPizza implements Pizza {
    private List<Ingredient> ingredientList;
    private double price;

    public MediumPizza(){
        ingredientList=new ArrayList<>();
        price=0;
    }
    public boolean addIngredient(Ingredient ingredient) {
        if(!ingredientList.contains(ingredient)) {
            ingredientList.add(ingredient);
            return true;
        }
        return false;
    }

    public int getIngredientCount() {
        return ingredientList.size();
    }

    @Override
    public boolean equals(Object o){
        if(o == this)   return  true;
        if(o == null)   return false;
        //if(o.getClass() != this.getClass()) return false;

        MediumPizza aux= (MediumPizza) o;
        if(aux.ingredientList.size() != this.ingredientList.size())
            return false;
        else{
            for(Ingredient  auto: this.ingredientList)
                if(!aux.ingredientList.contains(auto))
                    return false;
        }
        return true;
    }

    public List<Ingredient> getIngredients() {
        return ingredientList;
    }

    public void setIngredientList(List<Ingredient> ingredientList) {
        this.ingredientList = ingredientList;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
