import java.util.Scanner;

public class N {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int z = 0;
        int p = 0;
        int ng= 0;
        for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();

            if (number == 0) {
                z++;
            } else if (number > 0) {
                p++;
            } else {
                n++;
            }
        }
        System.out.println(z + " " + p + " " + ng);
    }
}
