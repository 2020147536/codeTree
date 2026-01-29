import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringBuilder sb = new StringBuilder();
        sb.append(input.substring(0,1)).append("a").append(input.substring(2,input.length()-2)).append("a").append(input.substring(input.length()-1));
        System.out.println(sb);
    }
}