import java.util.Scanner;

public class j01007 {
    public static long[] fibo = new long[93];
    public static void setfibo() {
        fibo[0] = 0L; fibo[1] = 1L;
        for (int i = 2; i <= 92; i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        setfibo();
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            boolean check = false;
            for (long i : fibo) {
                if (i == n){
                    check = true;
                    break;
                }
            }
            if (check)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
