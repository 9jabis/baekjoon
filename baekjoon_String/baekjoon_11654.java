package baekjoon_String;
import java.util.Scanner;
public class baekjoon_11654 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int ch = in.next().charAt(0);   // Scanner에는 문자를 받으러면 nextLine()이나 next()를 통해 문자열로 입력받아서 charAt() 으로 문자로 잘라내주어야한다.
                                        // String으로 입력받는다 -> String에서 char로, 즉 문자열을 잘라 문자로 변환한다. -> int 타입 변수에 저장함으로써 문자에 대응되는 값, 즉 아스키 코드를 저장한다.

        System.out.println(ch);
    }
}
