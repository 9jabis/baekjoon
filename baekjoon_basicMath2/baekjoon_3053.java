package baekjoon_basicMath2;
import java.util.Scanner;
public class baekjoon_3053 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double R = in.nextDouble();
        in.close();

        System.out.println(R*R*Math.PI);    // 유클리드 원의 넓이
        System.out.println(2*R*R);  //택시기하학 원의 넓이
    }
}
