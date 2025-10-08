// Salesperson.java
// Merepresentasikan seorang wiraniaga.

package studi_kasus3;
public class Salesperson implements Comparable {
    private String firstName, lastName;
    private int totalSales;

    // Constructor
    public Salesperson(String first, String last, int sales) {
        firstName = first;
        lastName = last;
        totalSales = sales;
    }

    // Mengembalikan representasi string
    public String toString() {
        return lastName + ", " + firstName + ": \t" + totalSales;
    }

    // Membandingkan kesamaan nama
    public boolean equals(Object other) {
        return (lastName.equals(((Salesperson) other).getLastName()) &&
                firstName.equals(((Salesperson) other).getFirstName()));
    }

    // Mengurutkan berdasarkan total penjualan (menurun)
    // Jika penjualan sama, urutkan berdasarkan nama (alfabetis terbalik)
    public int compareTo(Object other) {
        int result;
        Salesperson otherSales = (Salesperson) other;

        // Bandingkan berdasarkan total penjualan
        if (this.totalSales > otherSales.getSales()) {
            result = -1; // Objek ini lebih besar, harus di depan
        } else if (this.totalSales < otherSales.getSales()) {
            result = 1; // Objek ini lebih kecil, harus di belakang
        } else {
            // Jika penjualan sama, bandingkan berdasarkan nama
            String myName = this.lastName + this.firstName;
            String otherName = otherSales.getLastName() + otherSales.getFirstName();
            // compareTo() String mengurutkan A-Z. Kita balik hasilnya untuk Z-A.
            result = otherName.compareTo(myName);
        }
        return result;
    }

    // Accessor untuk nama depan
    public String getFirstName() {
        return firstName;
    }

    // Accessor untuk nama belakang
    public String getLastName() {
        return lastName;
    }

    // Accessor untuk total penjualan
    public int getSales() {
        return totalSales;
    }
}