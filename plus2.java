import java.util.Scanner;
public class plus2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();

        int sum=0;
        for(int i=1; i<=n; i++){
            sum=sum+i;
            System.out.println(i);
        }

        System.out.println(sum);
    }
}
