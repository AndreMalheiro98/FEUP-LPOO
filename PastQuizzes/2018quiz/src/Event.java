import java.util.HashMap;
import java.util.Map;

public class Event{
    private String title,date,description;
    private Map<String,Integer> participants;

    @Override
    public String toString(){
        return (this.title + " is a " + this.description + " and will be held at " + this.date + ".");
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null) return false;
        if(getClass() != o.getClass()) return false;

        Event p = (Event) o;
        return date.equals(p.date) && description.equals(p.description) && title.equals(p.title);
    }

    public Event(Event e){
        this(e.getTitle(),e.getDate(),e.getDescription());
    }

    public Map<String, Integer> getParticipants() {
        return participants;
    }

    public Event(String title){
        this(title,"");
    }

    public Event(String title,String date){
        this(title,date,"");
        this.date=date;
    }

    public Event(String title, String date, String description){
        this.title=title;
        this.date=date;
        this.description=description;
        this.participants=new HashMap<>();
    }

    public String getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public String getTitle() {
        return title;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void addPerson(Person participant){
        if(!this.participants.containsKey(participant.getName()))
            this.participants.put(participant.getName(),participant.getAge());
    }

    public int getAudienceCount(){
        return this.participants.size();
    }
}

