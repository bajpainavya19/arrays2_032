package Core;

public class insertionSort {
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {8, 6, 9, 3, 5};
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i]; // Corrected to hold the value
            int j = i - 1;
            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }
            // Place the value
            arr[j+1] = current;
        }

        printArray(arr);
    }
}
