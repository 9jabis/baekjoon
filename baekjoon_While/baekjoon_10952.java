package baekjoon_While;
import java.util.Scanner;
public class baekjoon_10952 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(true){
            int a = in.nextInt();
            int b = in.nextInt();

            if(a==0 && b==0){
                in.close();
                break;
            }
            System.out.println(a+b);
        }
    }
}
