import java.util.Scanner;

public class j01002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextInt();
            long tong = 0;
            tong = (n+1)*n/2;
            System.out.println(tong);
        }
    }
}
