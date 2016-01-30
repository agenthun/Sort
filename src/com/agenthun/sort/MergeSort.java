package com.agenthun.sort;

/**
 * Created by Agent Henry on 2015/7/6.
 */
public class MergeSort {
    public static void Merge1(int a[], int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= right) {
//            if (a[i] > a[j]) {//大->小
            if (a[i] < a[j]) {
                temp[k++] = a[i++];
            } else {
                temp[k++] = a[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = a[i++];
        }
        while (j <= right) {
            temp[k++] = a[j++];
        }

        for (int l = 0; l < temp.length; l++) {
            a[l + left] = temp[l];
        }
    }

    public static void Merge2(int a[], int left, int mid, int right) {
        int i, j, k, n1, n2;
        n1 = mid - left + 1;
        n2 = right - mid;
        int[] L = new int[n1];
        int[] R = new int[n2];
        for (i = 0, k = left; i < n1; i++, k++) {
            L[i] = a[k];
        }
        for (i = 0, k = mid + 1; i < n2; i++, k++) {
            R[i] = a[k];
        }

        for (k = left, i = 0, j = 0; i < n1 && j < n2; k++) {
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

    public static void MergeSort(int[] a, int left, int right) {
        if (a == null || a.length <= 0) return;
        if (left < right) {
            int mid = (left + right) / 2;
            MergeSort(a, left, mid);
            MergeSort(a, mid + 1, right);
            Merge1(a, left, mid, right);
//            Merge2(a, left, mid, right);
        }
    }

    public static void main(String[] args) {
        int[] list = {10, 5, 2, 8, 2, 9};
        System.out.println("old array");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        MergeSort(list, 0, list.length - 1);
        System.out.println("\r\ncom.agenthun.sort.MergeSort");
        System.out.println("new array");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }
}
