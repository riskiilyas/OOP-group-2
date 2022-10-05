package teather;

import static teather.Genre.*;

public class Cashier extends Employee{

    public Cashier() {
        super("John", 1);
    }

    @Override
    public void startTheJob() {
        super.startTheJob();
        System.out.println("Ready to serve customer...");
    }

    public void chooseGenre(Genre genre, FilmSchedule filmSchedule) {
        double ticketPrice = 0.0;
        Film film = null;
        if (genre == ActionGenre) {
            ticketPrice = Ticket.calculatePrice(filmSchedule.getActionFilms().getFilmDuration());
            film = filmSchedule.getActionFilms();
        } else if (genre == ComedyGenre) {
            ticketPrice = Ticket.calculatePrice(filmSchedule.getComedyFilms().getFilmDuration());
            film = filmSchedule.getComedyFilms();
        } else if(genre == HorrorGenre) {
            ticketPrice = Ticket.calculatePrice(filmSchedule.getHorrorFilms().getFilmDuration());
            film = filmSchedule.getHorrorFilms();
        } else {
            ticketPrice = Ticket.calculatePrice(filmSchedule.getRomanceFilms().getFilmDuration());
            film = filmSchedule.getRomanceFilms();
        }

        System.out.println(
                "Action genre film:\n" + "Title: " + film.getFilmTitle() + "\nPrice : "
                        + ticketPrice + "\nDuration : " + film.getFilmDuration()
        );
    }

    public Ticket buyTicket(double cash, Genre genre, FilmSchedule filmSchedule, boolean isPremium) {
        Film film = null;

        if (genre == ComedyGenre) {
            film = filmSchedule.getComedyFilms();
        } else if(genre == RomanceGenre) {
            film = filmSchedule.getRomanceFilms();
        } else if(genre == ActionGenre) {
            film = filmSchedule.getActionFilms();
        } else {
            film = filmSchedule.getHorrorFilms();
        }

        Ticket ticket;
        if (isPremium) {
            ticket = new Ticket(film, new RoomPremium(genre, film, new CleaningService()));
        } else {
            ticket = new Ticket(film, new Room(genre, 1 ,film, new CleaningService()));
        }
        double price = ticket.calculatePrice();

        if (cash < price) {
            System.out.println("Your money is not enough!");
            return null;
        } else {
            System.out.println("Enjoy The Film :)");
            return ticket;
        }
    }
}
