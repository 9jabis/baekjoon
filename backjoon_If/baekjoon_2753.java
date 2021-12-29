package backjoon_If;

import java.util.Scanner;

public class baekjoon_2753 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int yoonyear = in.nextInt();

        if(yoonyear % 4 ==0){
            if(yoonyear % 400 == 0) System.out.println("1");
            else if(yoonyear % 100 == 0) System.out.println("0");
            else System.out.println("1");
        }
        else System.out.println("0");

    }
}
