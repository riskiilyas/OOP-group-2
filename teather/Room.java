package teather;

public class Room {
    // Properties
    private Genre roomGenre;
    private int roomId;
    private Film film;
    private CleaningService cleaningService;

    // constructor
    public Room(Genre roomGenre, int roomId, Film film, Employee cleaningService) {
        this.cleaningService = (CleaningService) cleaningService;
        this.roomGenre = roomGenre;
        this.roomId = roomId;
        this.film = film;
    }

    // Behaviour
    public void startRoomMovie() {
        film.startFilm();
        System.out.println("Room is Starting the Film");
    }

    public void cleanRoom() {
        cleaningService.startTheJob();
    }

    public void closeRoom() {
        System.out.println("Room is Closing...");
    }

    public Genre getRoomGenre() {
        return roomGenre;
    }

    public void setRoomGenre(Genre roomGenre) {
        this.roomGenre = roomGenre;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }
}
