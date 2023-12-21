package Example.Array.new2;

import java.util.Scanner;
import java.util.ServiceConfigurationError;

public class Fuck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int count = 1;
        for (int i = 1; i <= a; i++) {
            count *= i;

        }
        System.out.println(count);
    }
}
