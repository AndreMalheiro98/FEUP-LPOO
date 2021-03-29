import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BoxOffice {
    public static Map<Concert,Integer> ticketList = new HashMap<>();

    /*----------Methods-------------*/
    public static List<Ticket> buy(Concert show, int numberOfTicketsDesired) throws InvalidTicket {
        if(show==null)
            return null;

        List<Ticket> tickets= new ArrayList<>();
        if(ticketList.containsKey(show)){
            int numberTicketsSoFar= ticketList.get(show);
            for(int i = 1; i <= numberOfTicketsDesired; i++)
                tickets.add(new Ticket(i+numberTicketsSoFar,show));
            ticketList.replace(show,numberTicketsSoFar+numberOfTicketsDesired);
        }else{
            for(int i=1;i<=numberOfTicketsDesired;i++)
                tickets.add(new Ticket(i,show));
            ticketList.put(show,numberOfTicketsDesired);
        }
        return tickets;
    }
}
