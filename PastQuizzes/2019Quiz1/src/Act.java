public abstract class Act {
    private String name,country;

    /*-------Constructors-------*/
    public Act(String name,String country){
        this.country=country;
        this.name=name;
    }

    /*-----Getters-------*/
    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }


}
