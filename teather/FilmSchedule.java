package teather;

import static teather.Genre.*;

public class FilmSchedule {
    // Properties
    private Film actionFilms;
    private Film comedyFilms;
    private Film horrorFilms;
    private Film romanceFilms;


    // Behaviour
    public void addFilm(Film film) {
        Genre genre = film.getFilmGenre();

        if (genre == ActionGenre) {
            actionFilms = film;
        } else if(genre == ComedyGenre) {
            comedyFilms = film;
        } else if(genre == RomanceGenre) {
            romanceFilms = film;
        } else  {
            horrorFilms = film;
        }
    }

    public Film getActionFilms() {
        return actionFilms;
    }

    public void setActionFilms(Film actionFilms) {
        this.actionFilms = actionFilms;
    }

    public Film getComedyFilms() {
        return comedyFilms;
    }

    public void setComedyFilms(Film comedyFilms) {
        this.comedyFilms = comedyFilms;
    }

    public Film getHorrorFilms() {
        return horrorFilms;
    }

    public void setHorrorFilms(Film horrorFilms) {
        this.horrorFilms = horrorFilms;
    }

    public Film getRomanceFilms() {
        return romanceFilms;
    }

    public void setRomanceFilms(Film romanceFilms) {
        this.romanceFilms = romanceFilms;
    }
}
