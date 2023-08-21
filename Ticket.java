import Place.Seat;
import Session.MovieSession;

public class Ticket {
    public long rootNumber;
    public double price;
    public boolean isValid;
    public Seat seat;
    public MovieSession movieSession;
    
    public Ticket(long rootNumber, double price, boolean isValid, Seat seat, MovieSession movieSession) {
        this.rootNumber = rootNumber;
        this.price = price;
        this.isValid = isValid;
        this.seat = seat;
        this.movieSession = movieSession;
    }
    
}
