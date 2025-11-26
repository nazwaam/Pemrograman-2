package ui;

import core.BaseMenu;
import model.Movie;
import service.IMovieService;

import java.util.Scanner;

public class InputDataMenu extends BaseMenu {

    private final IMovieService movieService;

    public InputDataMenu(IMovieService movieService) {
        this.movieService = movieService;
    }

    @Override
    public void showMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== TAMBAH FILM ===");
        System.out.print("Judul : ");
        String title = sc.nextLine();
        System.out.print("Genre : ");
        String genre = sc.nextLine();

        movieService.addMovie(new Movie(title, genre));
        System.out.println("Film berhasil ditambahkan!");
    }
}