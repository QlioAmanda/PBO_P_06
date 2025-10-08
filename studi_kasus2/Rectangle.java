// Rectangle.java
// Merepresentasikan bentuk persegi panjang.

package studi_kasus2;
public class Rectangle extends Shape {
    private double length;
    private double width;

    // Constructor untuk mengatur panjang dan lebar
    public Rectangle(double length, double width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }

    // Implementasi method area() untuk persegi panjang
    @Override
    public double area() {
        return length * width; // Rumus: panjang * lebar
    }

    // Mengembalikan deskripsi lengkap dari objek
    @Override
    public String toString() {
        return super.toString() + " of length " + length + " and width " + width;
    }
}