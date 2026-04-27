import java.util.Random;

public class Sorter {
    public void basicSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    public void advancedSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) minIdx = j;
            }
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }

    public void printArray(int[] arr) {
        for (int val : arr) System.out.print(val + " ");
        System.out.println();
    }

    public int[] generateRandomArray(int size) {
        Random rd = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) arr[i] = rd.nextInt(100);
        return arr;
    }
}