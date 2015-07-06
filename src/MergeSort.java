/**
 * Created by Agent Henry on 2015/7/6.
 */
public class MergeSort {
    public static void Merge(int a[], int p, int q, int r) {
        int i, j, k, n1, n2;
        n1 = q - p + 1;
        n2 = r - q;
        int[] L = new int[n1];
        int[] R = new int[n2];
        for (i = 0, k = p; i < n1; i++, k++) {
            L[i] = a[k];
        }
        for (i = 0, k = q + 1; i < n2; i++, k++) {
            R[i] = a[k];
        }

        for (k = p, i = 0, j = 0; i < n1 && j < n2; k++) {
            if (L[i] > R[j]) {
                a[k] = L[i];
                i++;
            } else {
                a[k] = R[j];
                j++;
            }
        }
        if (i < n1) {
            for (j = i; j < n1; j++, k++) a[k] = L[j];
        }
        if (j < n2) {
            for (i = j; i < n2; i++, k++) a[k] = R[i];
        }
    }

    public static void MergeSort(int[] a, int p, int r) {
        if (a == null || a.length <= 0) return;
        if (p < r) {
            int q = (p + r) / 2;
            MergeSort(a, p, q);
            MergeSort(a, q + 1, r);
            Merge(a, p, q, r);
        }
    }

    public static void main(String[] args) {
        int[] list = {10, 5, 2, 8, 9};
        System.out.println("old array");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        MergeSort(list, 0, list.length - 1);
        System.out.println("\r\nMergeSort");
        System.out.println("new array");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }
}
