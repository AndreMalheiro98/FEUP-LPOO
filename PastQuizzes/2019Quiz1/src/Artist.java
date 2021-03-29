public class Artist extends Act{

    /*---------Constructor---------*/
    public Artist(String name,String country){
        super(name,country);
    }

    /*----------Overrided methods-------*/
    @Override
    public boolean equals(Object o){
        if(o == this)   return true;
        if(o == null)   return false;

        if(o.getClass() != this.getClass()) return false;

        Artist aux=(Artist) o;
        if(aux.getCountry().equals(this.getCountry()) && aux.getName().equals(this.getName()))
            return true;

        return false;
    }
}
