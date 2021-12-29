package baekjoon_1Arr;
import java.util.Scanner;

public class baekjoon_8958 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String arr[] = new String[in.nextInt()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.next();
        }

        in.close();

        for (int i = 0; i < arr.length; i++) {

            int cnt = 0;	// 연속횟수
            int sum = 0;	// 누적 합산

            for (int j = 0; j < arr[i].length(); j++) {

                if (arr[i].charAt(j) == 'O') {  //charAt() 원소의 문자열을 하나하나 검사한다.
                    cnt++;
                }
                else {
                    cnt = 0;
                }
                sum += cnt;
            }

            System.out.println(sum);
        }
    }
}