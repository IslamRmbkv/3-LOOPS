import java.util.Scanner;

public class I {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int count = 0;
        for (int i = 1; i * i <= x; i++) {
            if (x % i == 0) {
                count++;

                if (i * i != x) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
