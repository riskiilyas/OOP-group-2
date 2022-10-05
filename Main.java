import teather.*;

import javax.swing.*;
import java.net.CacheRequest;

import static teather.Genre.*;
import static teather.Genre.ActionGenre;

public class Main {

    public static void main(String[] args) {
        FilmSchedule filmSchedule = new FilmSchedule();
        Film actionFilm = new Film(ActionGenre, "Wildan Adventure", 2.0);
        Film comedyFilm = new Film(ComedyGenre, "Life of Wildan", 2.0);
        Film romanceFilm = new Film(RomanceGenre, "Love of Wildan", 2.0);
        Film horrorFilm = new Film(HorrorGenre, "The Return of Wildan", 2.0);

        filmSchedule.addFilm(actionFilm);
        filmSchedule.addFilm(comedyFilm);
        filmSchedule.addFilm(romanceFilm);
        filmSchedule.addFilm(horrorFilm);

        Cashier cashier = new Cashier();
        CleaningService cleaningService = new CleaningService();

        double buyerCash = Double.parseDouble(JOptionPane.showInputDialog("Input the money!"));
        String genre = JOptionPane.showInputDialog("Input film genre!");
        String isPremium = JOptionPane.showInputDialog("Do you want a premium room? Y/N");
        boolean premium = isPremium == "Y";
        if (genre.toLowerCase() == ActionGenre.name().toLowerCase()) {
            cashier.chooseGenre(ActionGenre, filmSchedule);
            cashier.buyTicket(buyerCash, ActionGenre, filmSchedule, premium);
        } else if(genre.toLowerCase() == ComedyGenre.name().toLowerCase()) {
            cashier.chooseGenre(ComedyGenre, filmSchedule);
            cashier.buyTicket(buyerCash, ComedyGenre, filmSchedule, premium);
        } else if(genre.toLowerCase() == RomanceGenre.name().toLowerCase()) {
            cashier.chooseGenre(RomanceGenre, filmSchedule);
            cashier.buyTicket(buyerCash, RomanceGenre, filmSchedule, premium);
        } else {
            cashier.chooseGenre(HorrorGenre, filmSchedule);
            cashier.buyTicket(buyerCash, HorrorGenre, filmSchedule, premium);
        }

    }


}
