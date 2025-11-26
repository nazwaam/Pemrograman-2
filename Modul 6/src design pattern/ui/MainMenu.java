package ui;

import core.BaseMenu;

public class MainMenu extends BaseMenu {

    @Override
    public void showMenu() {
        System.out.println("=== MENU UTAMA ===");
        System.out.println("1. Tambah Film Favorit");
        System.out.println("2. Lihat Daftar Film");
        System.out.println("0. Keluar");
    }
}