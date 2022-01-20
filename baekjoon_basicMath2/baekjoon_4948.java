package baekjoon_basicMath2;
import java.util.Scanner;
public class baekjoon_4948 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            int n = in.nextInt();
            if (n == 0) {
                break;
            }

            boolean arr[] = new boolean[2*n+1]; // 0~n
            arr[0] = true;
            arr[1] = true;  //2(소수)부터 검사하니 0과 1은 true로 미리 설정한다.

            for(int i=2; i<=Math.sqrt(2*n+1); i++){ //2부터 (2*n+1)의 제곱근까지 검사
                for(int j=i*i; j<2*n+1; j+=i){   //제곱근은 소수가 될 수 없다. j에 i값씩 더해가며 반복(2->4->6->..., 3->9->-12->...)
                    arr[j] = true;  //
                }
            }
            int count = 0;
            for(int i=n+1; i<2*n+1; i++){   //n보다 크고 2n보다 작거나 같으므로
                if(arr[i] == false){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
