package Session;

import javax.print.attribute.DateTimeSyntax;

public class MovieSession {
    public int sessionID;
    public Movie movie;
    public DateTimeSyntax dateTime;
    
    public MovieSession(int sessionID, Movie movie, DateTimeSyntax dateTime) {
        this.sessionID = sessionID;
        this.movie = movie;
        this.dateTime = dateTime;
    }
   
}
