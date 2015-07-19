package com.agenthun.sort;

/**
 * Created by Agent Henry on 2015/7/7.
 */
public class QuickSort {
    private static void sort(int[] a, int low, int high) {
        int i, j;
        int index;
        if (low >= high) return;
        i = low;
        j = high;
        index = a[i];
        while (i < j) {
            while (i < j && a[j] >= index) j--;
            if (i < j) a[i++] = a[j];
            while (i < j && a[i] < index) i++;
            if (i < j) a[j--] = a[i];
        }
        a[i] = index;
        sort(a, low, i - 1);
        sort(a, i + 1, high);
    }

    public static void QuickSort(int[] a) {
        if (a == null || a.length <= 0) return;
        sort(a, 0, a.length - 1);
    }

    public static void main(String[] args) {
        int[] list = {10, 5, 2, 8, 9};
        System.out.println("old array");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        QuickSort(list);
        System.out.println("\r\ncom.agenthun.sort.QuickSort");
        System.out.println("new array");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }
}
