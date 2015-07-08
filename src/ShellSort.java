/**
 * Created by Agent Henry on 2015/7/8.
 */
public class ShellSort {
    public static void ShellSort(int[] a) {
        if (a == null && a.length <= 0) return;
        int length = a.length;
        int i, j;
        int h;
        int temp;
        for (h = length / 2; h > 0; h = h / 2) {
            for (i = h; i < length; i++) {
                temp = a[i];
                for (j = i - h; j >= 0; j -= h) {
                    if (temp < a[j]) {
                        a[j + h] = a[j];
                    } else {
                        break;
                    }
                }
                a[j + h] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] list = {10, 5, 2, 8, 9};
        System.out.println("old array");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        ShellSort(list);
        System.out.println("\r\nShellSort");
        System.out.println("new array");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }
}
