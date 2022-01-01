package baekjoon_String;
import java.util.Scanner;
public class baekjoon_2908 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();

        in.close();

        a = Integer.parseInt(new StringBuilder().append(a).reverse().toString());   // StringBuilder 생성과 동시에 append() 메소드가 값을 넣어준다. 이를 reverse()하여 앞뒤를 바꿔주고
                                                                                    // toString으로 문자열로 반환시킨다. 마지막으로 Interger.parseInt로 숫자로 받는다.
        b = Integer.parseInt(new StringBuilder().append(b).reverse().toString());

        System.out.println(a>b ? a:b);  // 삼항 연산자 조건식(피연산자1) ? 피연산자2 : 피연산자3    ->  조건식이 참이면 값은 피연산자2, false면 피연산자3
    }
}
