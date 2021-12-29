package baekjoon_1Arr;
import java.util.Scanner;
import java.util.Arrays;
public class baekjoon_2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int max = 0;
        int j = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[max] < arr[i]) {
                max = i;
                j = i;
            }
        }
        System.out.println(arr[max]);
        System.out.println((j + 1));
    }
}