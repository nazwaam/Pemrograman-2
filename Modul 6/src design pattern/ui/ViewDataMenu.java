package ui;

import core.BaseMenu;
import service.IMovieService;

public class ViewDataMenu extends BaseMenu {

    private final IMovieService movieService;

    public ViewDataMenu(IMovieService movieService) {
        this.movieService = movieService;
    }

    @Override
    public void showMenu() {
        System.out.println("=== DAFTAR FILM ===");
        if (movieService.isEmpty()) {
            System.out.println("Belum ada data.");
            return;
        }

        int i = 1;
        for (var m : movieService.getAllMovies()) {
            System.out.println(i + ". " + m);
            i++;
        }
    }
}