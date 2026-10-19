import java.util.Scanner;

public class Q {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        for (int x = 1000; x >= 0; x--) {
            long result = (long) a * x * x * x + (long) b * x * x + (long) c * x + d;
            if (result == 0) {
                System.out.print(x + " ");
            }
        }
    }
}
