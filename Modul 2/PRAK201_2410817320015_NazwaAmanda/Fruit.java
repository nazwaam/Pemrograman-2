package PRAK201_2410817320015_NazwaAmanda;

public class Fruit  {
    String fruitName;
    double weight;
    double price;
    double purchaseAmount;

    public Fruit(String fruitName, double weight, double price, double purchaseAmount) {
        this.fruitName = fruitName;
        this.weight = weight;
        this.price = price;
        this.purchaseAmount = purchaseAmount;
    }

    public String getFruitName() {
        return fruitName;
    }

    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    public double getPurchaseAmount() {
        return purchaseAmount;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setPurchaseAmount(double purchaseAmount) {
        this.purchaseAmount = purchaseAmount;
    }

    public double priceBeforeDiscount() {
        return (this.purchaseAmount / this.weight) * this.price;
    }

    public double totalDiscount() {
        return Math.floor(this.purchaseAmount / 4) * (this.price * 0.08);
    }

    public double priceAfterDiscount() {
        return this.priceBeforeDiscount() - this.totalDiscount();
    }

    void displayInfo() {
        System.out.println("Nama Buah: " + this.fruitName);
        System.out.println("Berat: " + this.weight);
        System.out.println("Harga: " + this.price);
        System.out.println("Jumlah Beli: " + this.purchaseAmount + "kg");
        System.out.printf("Harga Sebelum Diskon: Rp%.2f\n", this.priceBeforeDiscount());
        System.out.printf("Total Diskon: Rp%.2f\n", this.totalDiscount());
        System.out.printf("Harga Setelah Diskon: Rp%.2f\n", this.priceAfterDiscount());
        System.out.println();
    }
}