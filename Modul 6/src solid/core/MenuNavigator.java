package core;

import service.IMovieService;
import ui.InputDataMenu;
import ui.MainMenu;
import ui.ViewDataMenu;

import java.util.Scanner;

public class MenuNavigator {

    private final IMovieService movieService;

    public MenuNavigator(IMovieService movieService) {
        this.movieService = movieService;
    }

    public void start() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            new MainMenu().showMenu();

            System.out.print("Pilih menu: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> new InputDataMenu(movieService).showMenu();
                case 2 -> new ViewDataMenu(movieService).showMenu();
                case 0 -> {
                    System.out.println("Terima kasih!");
                    return;
                }
                default -> System.out.println("Pilihan tidak valid.");
            }
        }
    }
}