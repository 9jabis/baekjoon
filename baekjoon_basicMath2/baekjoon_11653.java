package baekjoon_basicMath2;
import java.util.Scanner;
public class baekjoon_11653 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        for(int i=2; i<=Math.sqrt(n); i++){
            while(n%i==0){
                System.out.println(i);
                n/=i;
            }
        }
        if(n!=1){
            System.out.println(n);
        }
    }
}
