package teather;

public class Ticket {
    // Properties
    private double filmDuration;
    private double ticketPrice;
    private Film film;
    private Room room;

    // Constructor
    public Ticket(Film film, Room room) {
        this.filmDuration = film.getFilmDuration();
        this.room = room;
        this.film = film;
    }

    // Behaviour
    public double calculatePrice() {
        return (filmDuration / 0.5) * 15000.0;
    }

    public static double calculatePrice(double newDuration) {
        return (newDuration / 0.5) * 15000.0;
    }

    public double getFilmDuration() {
        return filmDuration;
    }

    public void setFilmDuration(double filmDuration) {
        this.filmDuration = filmDuration;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }
}
