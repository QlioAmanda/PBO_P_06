// Numbers.java
// Mendemonstrasikan pengurutan pada array integer.

package studi_kasus3;
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Integer[] intList;
        int size;
        Scanner scan = new Scanner(System.in);

        System.out.print("\nBerapa banyak integer yang ingin diurutkan? ");
        size = scan.nextInt();
        intList = new Integer[size];

        System.out.println("\nMasukkan angka-angkanya...");
        for (int i = 0; i < size; i++) {
            intList[i] = scan.nextInt();
        }

        // Memanggil insertionSort yang mengurutkan secara menurun
        Sorting.insertionSort(intList);

        System.out.println("\nAngka Anda dalam urutan menurun...");
        for (int i = 0; i < size; i++) {
            System.out.print(intList[i] + " ");
        }
        System.out.println();
        scan.close();
    }
}