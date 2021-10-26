public class SlicedPizza extends MediumPizza{
    private int numberOfSlices;
    private Pizza basePizza;

    public SlicedPizza(Pizza pizza, int slices){
        super();
        this.numberOfSlices=slices;
        this.setIngredientList(pizza.getIngredients());
        this.basePizza=pizza;
    }

    public int getSlices() {
        return numberOfSlices;
    }

    @Override
    public double getPrice(){
        return this.basePizza.getPrice()+2;
    }
}
