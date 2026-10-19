import java.util.Scanner;

public class O {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean hasZero = false;
        for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();
            if (number == 0) {
                hasZero = true;
            }
        }
        if (hasZero) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

