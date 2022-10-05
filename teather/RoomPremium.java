package teather;

public class RoomPremium extends Room{
    public RoomPremium(Genre genre, Film film, CleaningService cleaningService) {
        super(genre, 0, film, cleaningService);
    }

    @Override
    public void startRoomMovie() {
        super.startRoomMovie();
        System.out.println("Enjoy your premium benefit....");
    }
}
