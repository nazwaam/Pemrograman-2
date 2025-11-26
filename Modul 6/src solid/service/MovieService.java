package service;

import model.Movie;
import java.util.ArrayList;
import java.util.List;

public class MovieService implements IMovieService {

    private final List<Movie> movies = new ArrayList<>();

    @Override
    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    @Override
    public List<Movie> getAllMovies() {
        return movies;
    }

    @Override
    public boolean isEmpty() {
        return movies.isEmpty();
    }
}