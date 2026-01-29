import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean flag = false;
        if (n%2==1 && n%3==0) flag = true;
        else if (n%10==0) flag = true;
        System.out.println(flag);
    }
}