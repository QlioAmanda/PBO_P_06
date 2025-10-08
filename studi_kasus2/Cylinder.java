// Cylinder.java
// Merepresentasikan bentuk silinder.

package studi_kasus2;
public class Cylinder extends Shape {
    private double radius;
    private double height;

    // Constructor untuk mengatur radius dan tinggi
    public Cylinder(double radius, double height) {
        super("Cylinder");
        this.radius = radius;
        this.height = height;
    }

    // Implementasi method area() untuk silinder
    @Override
    public double area() {
        // Rumus sesuai instruksi: PI*radius^2*height
        return Math.PI * radius * radius * height;
    }

    // Mengembalikan deskripsi lengkap dari objek
    @Override
    public String toString() {
        return super.toString() + " of radius " + radius + " and height " + height;
    }
}