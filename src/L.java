import java.util.Scanner;

public class L {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int binary = scanner.nextInt();
        int decimal = 0;
        int power = 1;
        while (binary > 0) {
            int lastDigit = binary % 10;
            decimal += lastDigit * power;
            power *= 2;
            binary /= 10;
        }
        System.out.println(decimal);
    }
}
