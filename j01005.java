import java.util.Scanner;

public class j01005 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            int h = input.nextInt();
            for (double i = 1d; i < n; i++) {
                System.out.printf("%.6f ", Math.sqrt(i / n) * h );
            }
            System.out.println();
        }
    }
}
