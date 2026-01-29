import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        boolean flag = false;
        if (y%4 == 0) {
            flag = true;
            if (y%100==0 && y%400!=0) flag = false;
        }
        System.out.println(flag);
    }
}