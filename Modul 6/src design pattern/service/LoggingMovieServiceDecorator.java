package service;

import model.Movie;
import java.time.LocalDateTime;
import java.util.List;

public class LoggingMovieServiceDecorator implements IMovieService {

    private final IMovieService wrapped;

    public LoggingMovieServiceDecorator(IMovieService wrapped) {
        this.wrapped = wrapped;
    }

    @Override
    public void addMovie(Movie movie) {
        System.out.println("[LOG] " + LocalDateTime.now() + " → Menambahkan film: " + movie.getTitle());
        wrapped.addMovie(movie);
    }

    @Override
    public List<Movie> getAllMovies() {
        return wrapped.getAllMovies();
    }

    @Override
    public boolean isEmpty() {
        return wrapped.isEmpty();
    }
}