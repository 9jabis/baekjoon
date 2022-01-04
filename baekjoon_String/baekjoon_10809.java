package baekjoon_String;
import java.util.Scanner;
public class baekjoon_10809 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = new int[26]; // 알파벳은 26개

        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1;    // -1로 초기화 시킨다.
        }

        String S = in.nextLine();   // S 문자열 생성

        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);  // 문자열을 검사

            if (arr[ch - 'a'] == -1) { //arr원소 값이 -1인 경우에만 초기화(동밀 문자가 포함되어있는 경우 처음 나타난 위치로 나타내어햐한다.)
                arr[ch - 'a'] = i;  // 배열이 0부터 시작하니, ch의 위치가 i가 된다.
            }
        }

        for(int val : arr){ // val = arr[i]
            System.out.println(val + " ");
        }
    }
}
