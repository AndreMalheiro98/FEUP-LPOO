import java.util.Objects;

public class Ingredient {
    private String name;

    public Ingredient(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o){
        if(o == this)   return  true;
        if(o == null)   return false;
        if(o.getClass() != this.getClass()) return false;

        Ingredient aux= (Ingredient) o;

        return (aux.getName().equals(this.name)) ;
    }


}
