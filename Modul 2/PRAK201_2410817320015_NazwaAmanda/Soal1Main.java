package PRAK201_2410817320015_NazwaAmanda;

public class Soal1Main {
    public static void main(String[] args) {
        Fruit apple = new Fruit("Apel", 0.4, 7000, 40.0);
        Fruit mango = new Fruit("Mangga", 0.2, 3500, 15.0);
        Fruit avocado = new Fruit("Alpukat", 0.25, 10000, 12.0);

        apple.displayInfo();
        mango.displayInfo();
        avocado.displayInfo();
    }
}