package core;

import java.util.Scanner;

public class MenuNavigator {

    private final MenuFactory factory;

    public MenuNavigator(MenuFactory factory) {
        this.factory = factory;
    }

    public void start() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            BaseMenu main = factory.createMenu(MenuType.MAIN);
            main.showMenu();

            System.out.print("Pilih menu: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> factory.createMenu(MenuType.INPUT).showMenu();
                case 2 -> factory.createMenu(MenuType.VIEW).showMenu();
                case 0 -> {
                    System.out.println("Terima kasih!");
                    return;
                }
                default -> System.out.println("Pilihan tidak valid!");
            }
        }
    }
}