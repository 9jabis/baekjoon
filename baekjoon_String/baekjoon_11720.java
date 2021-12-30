package baekjoon_String;
import java.util.Scanner;
public class baekjoon_11720 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        String a = in.next();
        in.close();

        int sum = 0;

        for(int i=0; i<N; i++){
            sum += a.charAt(i)-'0'; // charAt()은 아스키코드값을 반환하므로, -'0'이나 -48을 해주어야 원하는 값을 얻을 수 있다.
        }
        System.out.println(sum);
    }
}
