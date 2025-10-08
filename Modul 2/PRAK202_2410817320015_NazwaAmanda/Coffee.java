package PRAK202_2410817320015_NazwaAmanda;

public class Coffee {
    public String coffeeName;
    public String size;
    public double price;
    private String buyer;
    private double tax = 0.11;

    public void setBuyer(String buyer) {
        this.buyer = buyer;
    }

    public String getBuyer() {
        return buyer;
    }

    public double getTax() {
        return price * tax;
    }

    public void info() {
        System.out.println("Nama Kopi: " + coffeeName);
        System.out.println("Ukuran: " + size);
        System.out.println("Harga: Rp. " + price);
    }
}