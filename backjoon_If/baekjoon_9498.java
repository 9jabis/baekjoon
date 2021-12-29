package backjoon_If;

import java.util.Scanner;
public class baekjoon_9498 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int subject_score = in.nextInt();

        in.close();

        if(subject_score >= 90){
            System.out.println("A");
        }
        else if(subject_score >= 80 && subject_score <= 89){
            System.out.println("B");
        }
        else if(subject_score >= 70 && subject_score <= 79){
            System.out.println("C");
        }
        else if(subject_score >= 60 && subject_score <= 69){
            System.out.println("D");
        }
        else{
            System.out.println("F");
        }
    }
}
