public class Artist extends Person{

    public Artist(String name){
        this(name,0);
    }

    public Artist(String name,int age){
        super(name,age);
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
