import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int num3 = 0;
        int num5 = 0;
        for (int i = 0; i < 10; i++) {
            int input = sc.nextInt();
            if (input%3==0) num3++;
            if (input%5==0) num5++;
        }
        System.out.printf("%d %d", num3, num5);
    }
}