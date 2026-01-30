import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] map = new int[n][n];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                map[j][i] = j;
            }
        }
         for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(map[i][j]);
            }
            System.out.pirntln();
        }
    }
}