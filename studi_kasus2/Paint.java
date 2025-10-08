// Paint.java
// Merepresentasikan jenis cat dengan daya sebar tertentu.

package studi_kasus2;
public class Paint {
    private double coverage; // jumlah kaki persegi per galon

    // Constructor untuk mengatur objek cat
    public Paint(double c) {
        coverage = c;
    }

    // Menghitung jumlah cat (dalam galon) yang dibutuhkan
    public double amount(Shape s) {
        System.out.println("Computing amount for " + s);
        // Perbaiki baris ini untuk mengembalikan hasil yang benar
        return s.area() / coverage;
    }
}
