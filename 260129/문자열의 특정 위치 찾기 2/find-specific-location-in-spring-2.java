import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String[] s = {"apple", "banana", "grape", "blueberry", "orange"};
        char a = sc.nextChar();
        int count = 0;
        for (int i = 0; i < 5; i++) {
            if (s[i].charAt(2) == a || s[i].charAt(3) == a) {
                System.out.println(s[i]);
                count++;
            }
        }
        System.out.println(count);
    }
}