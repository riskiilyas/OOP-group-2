package teather;

public class Film {
    // Properties
    private Genre filmGenre;
    private String filmTitle;
    private double filmDuration;

    // Constructor
    public Film(Genre genre, String filmTitle, double filmDuration) {
        this.filmGenre = genre;
        this.filmTitle = filmTitle;
        this.filmDuration = filmDuration;
    }

    // Behaviour
    public void startFilm() {
        System.out.println("Film is started....");
    }

    public void stopFilm() {
        System.out.println("Film is stopped....");
    }

    public Genre getFilmGenre() {
        return filmGenre;
    }

    public void setFilmGenre(Genre filmGenre) {
        this.filmGenre = filmGenre;
    }

    public String getFilmTitle() {
        return filmTitle;
    }

    public void setFilmTitle(String filmTitle) {
        this.filmTitle = filmTitle;
    }

    public double getFilmDuration() {
        return filmDuration;
    }

    public void setFilmDuration(double filmDuration) {
        this.filmDuration = filmDuration;
    }
}
