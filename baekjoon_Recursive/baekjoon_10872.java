package baekjoon_Recursive;
import java.util.Scanner;
public class baekjoon_10872 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        in.close();
        int sum=1;
        while(N !=0){
            sum = sum*N;
        N--;
        }
        System.out.println(sum);
    }
}
