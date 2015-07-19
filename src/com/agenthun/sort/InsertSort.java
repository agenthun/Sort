package com.agenthun.sort;

/**
 * Created by Agent Henry on 2015/7/4.
 */
public class InsertSort {
    public static void InsertSort(int[] a) {
        if (a == null || a.length <= 0) return;
        for (int i = 1; i < a.length; i++) {
            if (a[i] < a[i - 1]) {
                int temp = a[i];
                int j = i;
                while (j > 0 && temp < a[j - 1]) {
                    a[j] = a[j - 1];
                    j--;
                }
                a[j] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] list = {10, 5, 2, 8, 9};
        System.out.println("old array");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        InsertSort(list);
        System.out.println("\r\ncom.agenthun.sort.InsertSort");
        System.out.println("new array");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }
}
