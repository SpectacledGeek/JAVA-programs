//CO-PRIME NUMBERS
import java.util.Scanner;

public class Coprime {
    public static void main(String[] args) {
        int start, end;
        boolean check = true;
        Scanner sc = new Scanner(System.in);
// Taking Range as a input
        System.out.print("Enter start of the range: ");
        start = sc.nextInt();
        System.out.print("Enter end of the range: ");
        end = sc.nextInt();
        sc.close();
// Checking for Co Prime inside the range
        for (int i = start; i < end; i++) {
            for (int j = i + 1; j <= end; j++) {
                for (int k = 2; k <= start; k++) {
                    if (i % k == 0 && j % k == 0) {
                        check = false;
                        break;
                    }
// If Co Prime then print them
                    if (check)
                        System.out.print("(" + i + "," + j + ") ");
// Resetting check variable
                    check = true;
                }
            }
        }
    }
}
