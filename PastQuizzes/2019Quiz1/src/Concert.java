import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Concert{
    private String city,country,date;
    private List<Act> shows;

    /*-----------Constructor----------*/
    public Concert(String location,String country,String date){
        this.city=location;
        this.country=country;
        this.date=date;
        this.shows=new ArrayList<>();
    }

    /*-----------Getters-------------*/
    public String getCountry() {
        return country;
    }

    public String getDate() {
        return date;
    }

    public List<Act> getActs() {
        return shows;
    }

    public String getCity() {
        return city;
    }

    /*----------Methods-------------*/
    public void addAct(Act newAct){
        this.shows.add(newAct);
    }

    public boolean isValid(Ticket ticket) throws InvalidTicket{
        if(ticket==null)
            throw new InvalidTicket();

        if(ticket.getConcert().equals(this))
            return true;

        return false;
    }

    public boolean participates(Artist artist){
        if(artist == null)
            return false;

        for(Act act : this.shows) {
            if (act.getClass().getName().equals("Band")){
                Band band= (Band) act;
                if(band.containsArtist(artist))
                    return true;
            }else if(act.equals(artist))
                return true;
        }
        return false;
    }

    /*---------Overrided Methods----------*/
    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null) return false;
        if(this.getClass() != o.getClass()) return false;

        Concert aux=(Concert) o;
        if(city.equals(aux.getCity()) && country.equals(aux.getCountry()) && date.equals(aux.getDate()) && shows.equals(aux.getActs()))
            return true;

        return false;
    }

    @Override
    public int hashCode(){
        return Objects.hash(city,country,date,shows);
    }

}
