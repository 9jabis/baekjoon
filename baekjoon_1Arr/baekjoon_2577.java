package baekjoon_1Arr;
import java.util.Scanner;
import java.util.Arrays;
public class baekjoon_2577 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] arr = new int[10];

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int sum = a*b*c;
        while(sum>0){
            arr[sum%10]++;  //10으로 나누어 나머지를 구한다. 나머지는 1의 자리를 의미하니, 나머지를 구하고 다음 배열원소를 ++ 시킨다.
            sum/=10;        //10나누어 몫만 저장
        }
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
