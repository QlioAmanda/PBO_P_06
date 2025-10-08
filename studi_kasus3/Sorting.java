// Sorting.java
// Mendemonstrasikan algoritma selection sort dan insertion sort.

package studi_kasus3;
public class Sorting {
    //-----------------------------------------------------------------
    // Mengurutkan array objek menggunakan algoritma selection sort.
    //-----------------------------------------------------------------
    public static void selectionSort(Comparable[] list) {
        int min;
        Comparable temp;

        for (int index = 0; index < list.length - 1; index++) {
            min = index;
            for (int scan = index + 1; scan < list.length; scan++) {
                if (list[scan].compareTo(list[min]) < 0) {
                    min = scan;
                }
            }

            // Tukar nilai
            temp = list[min];
            list[min] = list[index];
            list[index] = temp;
        }
    }

    //-----------------------------------------------------------------
    // Mengurutkan array objek menggunakan algoritma insertion sort
    // dalam urutan MENURUN (DESCENDING).
    //-----------------------------------------------------------------
    public static void insertionSort(Comparable[] list) {
        for (int index = 1; index < list.length; index++) {
            Comparable key = list[index];
            int position = index;

            // Geser nilai yang lebih kecil ke kanan
            // Tanda diubah dari < menjadi > untuk urutan menurun
            while (position > 0 && key.compareTo(list[position - 1]) > 0) {
                list[position] = list[position - 1];
                position--;
            }
            list[position] = key;
        }
    }
}