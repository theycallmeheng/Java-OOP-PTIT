import java.util.Scanner;

public class j01003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double x = 0;
        if ( a == 0 && b != 0)
            System.out.println("VN");
        else if ( a == 0 && b == 0)
            System.out.println("VSN");
            else{
                x = -b/a;
                System.out.printf("%.2f", x);
        }

    }
}
