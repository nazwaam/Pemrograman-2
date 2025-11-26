package service;

import model.Movie;
import java.util.List;

public interface IMovieService {
    void addMovie(Movie movie);
    List<Movie> getAllMovies();
    boolean isEmpty();
}