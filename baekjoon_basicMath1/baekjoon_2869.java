package baekjoon_basicMath1;
import java.util.Scanner;
public class baekjoon_2869 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int up = in.nextInt();
        int down = in.nextInt();
        int leight = in.nextInt();

        int day = (leight-down)/(up-down);

        if((leight-down)%(up-down) != 0){
            day++;
        }
        System.out.println(day);
    }
}

/*
import java.io.BufferedReader;
        import java.io.InputStreamReader;
        import java.io.IOException;
        import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int up = Integer.parseInt(st.nextToken());
        int down = Integer.parseInt(st.nextToken());
        int length = Integer.parseInt(st.nextToken());

        int day = (length - down) / (up - down);
        if ((length - down) % (up - down) != 0)
            day++;

        System.out.println(day);
    }
}
*/
