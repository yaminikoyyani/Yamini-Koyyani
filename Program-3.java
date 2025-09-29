import java.util.Scanner;

public class OddSeriesConditional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number (a): ");
        int a = sc.nextInt();

        // If 'a' is even, reduce by 1 to get the count of odd numbers to generate
        int count = (a % 2 == 0) ? a - 1 : a;

        System.out.print("Output: ");
        for (int i = 0; i < count; i++) {
            System.out.print((2 * i + 1));
            if (i < count - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();
        sc.close();
    }
}
