import java.util.Scanner;

public class J {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            int number = scanner.nextInt();
            sum += number;
        }

        System.out.println(sum);
    }
}

