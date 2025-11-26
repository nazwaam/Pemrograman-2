import core.MenuNavigator;
import service.IMovieService;
import service.MovieService;

public class Main {
    public static void main(String[] args) {
        IMovieService movieService = new MovieService();
        MenuNavigator navigator = new MenuNavigator(movieService);
        navigator.start();
    }
}