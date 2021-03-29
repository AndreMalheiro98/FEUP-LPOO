public class Speaker extends Person{
    private int fee;

    public Speaker(String name){
        this(name,0);
    }

    public Speaker(String name,int age){
        super(name,age);
        this.fee=0;
    }

    public int getFee(){
        return this.fee;
    }

    @Override
    public String toString(){
        return "Speaker "+ this.getName() + " has a fee value of " + this.fee + ".";
    }

    @Override
    public int compareTo(Object o){
        if(this == o) return 0;
        if(o == null) return 1;

        Person aux= (Person) o;
        if(this.getName().equals(aux.getName()) )
            return 0;
        else
            return 1;
    }
}
