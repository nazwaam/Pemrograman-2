package service;

import model.Movie;

public interface MovieObserver {
    void onMovieAdded(Movie movie);
}