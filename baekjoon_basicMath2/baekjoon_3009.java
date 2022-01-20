package baekjoon_basicMath2;
import java.util.Scanner;
public class baekjoon_3009 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] xy1 = {in.nextInt(), in.nextInt()};
        int[] xy2 = {in.nextInt(), in.nextInt()};
        int[] xy3 = {in.nextInt(), in.nextInt()};

        in.close();

        int x;
        int y;

        if(xy1[0] == xy2[0]){
            x = xy3[0];
        }
        else if(xy1[0] == xy3[0]){
            x = xy2[0];
        }
        else{
            x = xy1[0];
        }

        if(xy1[1] == xy2[1]){
            y = xy3[1];
        }
        else if(xy1[1] == xy3[1]){
            y = xy2[1];
        }
        else{
            y = xy1[1];
        }

        System.out.println(x +" "+ y);

    }
}
