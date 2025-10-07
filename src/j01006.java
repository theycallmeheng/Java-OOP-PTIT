import java.util.Scanner;

public class j01006 {
    public static long[] fibo = new long[100];
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            fibo[1] = fibo[2] = 1;
            for (int i = 3; i <= 92; i++) {
                fibo[i] = fibo[i - 1] + fibo[i - 2];
            }
            int n = sc.nextInt();
            System.out.println(fibo[n]);
        }
    }
}
