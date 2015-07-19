package com.agenthun.sort;

/**
 * Created by Agent Henry on 2015/7/10.
 */
public class MinHeapSort {
    public static void adjustMinHeap(int[] a, int pos, int len) {
        int temp;
        int child;
        for (temp = a[pos]; 2 * pos + 1 <= len; pos = child) {
            child = 2 * pos + 1;
            if (child < len && a[child] > a[child + 1]) child++;
            if (a[child] < temp) a[pos] = a[child];
            else break;
        }
        a[pos] = temp;
    }

    public static void MinHeapSort(int[] a) {
        int i;
        int len = a.length;
        for (i = len / 2 - 1; i >= 0; i--) {
            adjustMinHeap(a, i, len - 1);
        }
        for (i = len - 1; i >= 0; i--) {
            int temp = a[0];
            a[0] = a[i];
            a[i] = temp;
            adjustMinHeap(a, 0, i - 1);
        }
    }

    public static void main(String[] args) {
        int[] list = {10, 5, 2, 8, 9};
        System.out.println("old array");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        MinHeapSort(list);
        System.out.println("\r\ncom.agenthun.sort.MinHeapSort");
        System.out.println("new array");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }
}
