import java.util.Scanner;

public class M {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int zeroCount = 0;
        for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();
            if (number == 0) {
                zeroCount++;
            }
        }
        System.out.println(zeroCount);
    }
}

