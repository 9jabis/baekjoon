package baekjoon_Recursive;
import java.util.Scanner;
public class baekjoon_10870 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        System.out.println(fivo(n));
    }

    static int fivo(int n){
        if(n==0)
            return 0;
        else if(n==1){
            return n;
        }
        return fivo(n-1) + fivo(n-2);
    }
}
