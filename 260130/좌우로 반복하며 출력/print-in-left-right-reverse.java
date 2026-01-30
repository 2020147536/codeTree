import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = "123456789";
        s = s.substring(0,n);
        String sr = new StringBuilder().append(s).reverse().toString();
        for (int i = 1; i <= n; i++) {
            if (i%2==1) System.out.println(s);
            else System.out.println(sr);
        }
    }
}