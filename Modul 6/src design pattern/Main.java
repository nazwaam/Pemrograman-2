import core.MenuNavigator;
import core.MenuType;
import factory.AppMenuFactory;
import model.Movie;
import service.IMovieService;
import service.LoggingMovieServiceDecorator;
import service.MovieObserver;
import service.MovieService;

public class Main {
    public static void main(String[] args) {

        MovieService coreService = new MovieService();

        coreService.registerObserver(new MovieObserver() {
            @Override
            public void onMovieAdded(Movie movie) {
                System.out.println("[OBSERVER] Film baru ditambahkan: " + movie.getTitle());
            }
        });

        IMovieService decoratedService = new LoggingMovieServiceDecorator(coreService);

        AppMenuFactory factory = new AppMenuFactory(decoratedService);

        MenuNavigator navigator = new MenuNavigator(factory);
        navigator.start();
    }
}