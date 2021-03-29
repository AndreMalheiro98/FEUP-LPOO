public class Attendee extends  Person{
    private boolean paid;

    public Attendee(String name){
        this(name,0);
    }

    public Attendee(String name,int age){
        super(name,age);
        this.paid=false;
    }

    public boolean hasPaid(){
        return this.paid;
    }

    @Override
    public String toString(){
        return "Attendee "+ this.getName() + (this.paid ? " has" : " hasn't") + " paid its registration.";
    }

    @Override
    public int compareTo(Object o){
        if(this == o) return 0;
        if(o == null) return 1;

        Person aux= (Person) o;
        if(this.getName().equals(aux.getName()))
            return 0;
        else
            return 1;
    }
}
