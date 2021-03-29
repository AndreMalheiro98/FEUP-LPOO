import java.util.ArrayList;
import java.util.List;

public class Band extends Act{
    private List<Artist> members;

    /*-----Constructor-------*/
    public Band(String name,String country){
        super(name,country);
        this.members=new ArrayList<>();
    }

    /*---------Getters----------*/

    public List<Artist> getArtists() {
        return members;
    }

    /*-----Methods----------*/
    public void addArtist(Artist member){
        this.members.add(member);
    }

    public boolean containsArtist(Artist artist){
        if(artist==null)
            return false;

        for(Artist member : members)
            if(artist.equals(member))
                return true;

        return false;
    }

}
