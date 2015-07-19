package com.agenthun.sort;

/**
 * Created by Agent Henry on 2015/7/5.
 */
public class BubbleSort {
    public static void BubbleSort(int[] a) {
        if (a == null || a.length <= 0) return;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = a.length - 1; j > i; j--) {
                if (a[j] < a[j - 1]) {
                    int temp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = temp;
                }
            }
        }

    }

    public static void main(String[] args) {
        int[] list = {10, 5, 2, 8, 9};
        System.out.println("old array");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        BubbleSort(list);
        System.out.println("\r\ncom.agenthun.sort.BubbleSort");
        System.out.println("new array");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }
}
