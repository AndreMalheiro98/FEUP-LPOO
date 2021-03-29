import java.util.List;

public class Ticket {
    private int number;
    private Concert concert;

    /*----------Constructor-------------*/
    public Ticket(int number,Concert concert) throws InvalidTicket{
        if(number<0 || concert==null)
            throw new InvalidTicket();

        this.number=number;
        this.concert=concert;
    }

    /*----------Getters---------------*/
    public Concert getConcert() {
        return concert;
    }

    public int getNumber() {
        return number;
    }

}
