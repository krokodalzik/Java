package Example.Array.new2;

import java.sql.Array;
import java.util.Arrays;
import java.util.Random;

public class random {
    public static void main(String[] agrs) {
        Random random = new Random();
        int a = random.nextInt(10);
        int[] arr = new int[a];
        int n = arr.length;

        for (int i = 0; i < n; i++) {

            arr[i] = random.nextInt();
            System.out.println(Arrays.toString(arr));
            for (int k = 0; k < n - 1; k++) {
                for (int j = 0; j < n - k - 1; j++) {

                    if (arr[j] > arr[j + 1]) {
                        // меняем элементы местами
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }

                }
            }

        }
        System.out.println(Arrays.toString(arr));
    }
}


