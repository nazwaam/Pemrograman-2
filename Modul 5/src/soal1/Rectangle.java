package soal1;

public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double l, double w){
        super("Rectangle");
        this.length = l;
        this.width = w;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double area(){
        return getLength() * getWidth();
    }

    public String toString(){
        return super.toString() + " of length " + getLength() + " and width " + getWidth();
    }
}