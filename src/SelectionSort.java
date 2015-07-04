/**
 * Created by Agent Henry on 2015/7/3.
 */
public class SelectionSort {
    public static void SelectionSort(int[] a) {
        if (a == null || a.length <= 0) return;
        for (int i = 0; i < a.length; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[min] > a[j]) min = j;
            }
            if (i != min) {
                int temp = a[min];
                a[min] = a[i];
                a[i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] list = {10, 5, 2, 8, 9};
        System.out.println("old array");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        SelectionSort(list);
        System.out.println("\r\nSelectionSort");
        System.out.println("new array");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }
}