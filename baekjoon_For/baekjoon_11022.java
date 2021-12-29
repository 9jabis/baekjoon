package baekjoon_For;

import java.util.Scanner;
public class baekjoon_11022 {
    public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     int n = in.nextInt();


     for(int i=1; i<=n; i++){
        int a = in.nextInt();
        int b = in.nextInt();
         System.out.println("case #" + i + ": "+a+"+"+b+"="+(a+b));
     }
        in.close();
    }
}
