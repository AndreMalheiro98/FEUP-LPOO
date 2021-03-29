import java.util.ArrayList;
import java.util.List;

public class Party extends Event{
    private List<Event> eventList;

    public Party(String name, String date, String description){
        super(name,date,description);
        this.eventList=new ArrayList<>();
    }

    public void addEvent(Event event){
        this.eventList.add(event);
    }

    @Override
    public int getAudienceCount(){
        int count=0;

        for(Event event : eventList )
            count+=event.getAudienceCount();

        count+=this.getParticipants().size();
        return count;
    }

}
