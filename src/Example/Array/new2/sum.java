package Example.Array.new2;

public class sum {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int count = 0;
        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < arr.length; i++) {
            count += i;
        }
        System.out.println(count);

        int i = -1;
        System.out.println("\n");

        while (i < arr.length) {
            i += 1;
            count1 += i;
        }
        System.out.println(count1);
        System.out.println("\n");

        int j = 0;

        do {
            j += 1;
            count2 += j;
        }
        while (j < arr.length);
        System.out.println(count2);
    }
}
