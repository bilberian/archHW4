import Session.MovieSession;

public class Customer {
    public int ID;
    public Ticket[] tickets;
    public CashProvider cash;


    public boolean buyTicket(Ticket ticket) {
        ticket.isValid = true;
        return ticket.isValid;
    };

    public Ticket[] searchTicket(MovieSession movieSession, Ticket[] tickets) {
        return null;        
    };
}
