import java.util.Arrays;

public class Main {

    public static void Sort(int[] arr) {
        int n = arr.length;
        int gap = n;
        boolean swapped = true;

        while (gap > 1 || swapped) {
            gap = (int) (gap / 1.3);
            if (gap < 1) {
                gap = 1;
            }
            swapped = false;

            for (int i = 0; i + gap < n; i++) {
                if (arr[i] % 2 == 0 && arr[i + gap] % 2 == 0) {
                    if (arr[i] < arr[i + gap]) {
                        int temp = arr[i];
                        arr[i] = arr[i + gap];
                        arr[i + gap] = temp;
                        swapped = true;
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] numbers = {4, 1, 6, 3, 8, 5, 2, 10, 7}; // Исходный массив
      Sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}

