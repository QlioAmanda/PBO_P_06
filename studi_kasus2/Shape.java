// Shape.java
// Merepresentasikan sebuah bentuk generik (umum).

package studi_kasus2;
public abstract class Shape {
    // Instance variable untuk nama bentuk
    protected String shapeName;

    // Constructor untuk mengatur nama bentuk
    public Shape(String name) {
        this.shapeName = name;
    }

    // Method abstrak untuk menghitung luas.
    // Setiap kelas turunan WAJIB mengimplementasikan method ini.
    public abstract double area();

    // Method untuk mengembalikan nama bentuk
    public String toString() {
        return shapeName;
    }
}