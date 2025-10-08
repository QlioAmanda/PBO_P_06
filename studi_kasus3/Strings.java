// Strings.java
// Mendemonstrasikan pengurutan pada array String.

package studi_kasus3;
import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        String[] stringList;
        int size;
        Scanner scan = new Scanner(System.in);

        System.out.print("\nBerapa banyak string yang ingin diurutkan? ");
        size = scan.nextInt();
        scan.nextLine(); // Membersihkan buffer

        stringList = new String[size];

        System.out.println("\nMasukkan string-nya...");
        for (int i = 0; i < size; i++) {
            stringList[i] = scan.nextLine();
        }

        // Memanggil insertionSort yang mengurutkan secara menurun (Z-A)
        Sorting.insertionSort(stringList);

        System.out.println("\nString Anda dalam urutan menurun...");
        for (int i = 0; i < size; i++) {
            System.out.println(stringList[i]);
            scan.close();
        }
    }
}