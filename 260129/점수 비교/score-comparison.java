import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int[] a = new int[2];
        int[] b = new int[2];
        a[0] = sc.nextInt();
        a[1] = sc.nextInt();
        b[0] = sc.nextInt();
        b[1] = sc.nextInt();
        System.out.println((a[0]>b[0])&&(a[1]>b[1])?1:0);
    }
}