package service;

import model.Movie;
import java.util.ArrayList;
import java.util.List;

public class MovieService implements IMovieService {

    private final List<Movie> movies = new ArrayList<>();
    private final List<MovieObserver> observers = new ArrayList<>();

    @Override
    public void addMovie(Movie movie) {
        movies.add(movie);
        notifyObservers(movie);
    }

    @Override
    public List<Movie> getAllMovies() {
        return movies;
    }

    @Override
    public boolean isEmpty() {
        return movies.isEmpty();
    }

    public void registerObserver(MovieObserver observer) {
        observers.add(observer);
    }

    private void notifyObservers(Movie movie) {
        for (MovieObserver obs : observers) {
            obs.onMovieAdded(movie);
        }
    }
}