import java.util.List;

public interface Pizza {
    boolean addIngredient(Ingredient ingredient);
    int getIngredientCount();
    List<Ingredient> getIngredients();
    double getPrice();
    void setPrice(double price);

}
