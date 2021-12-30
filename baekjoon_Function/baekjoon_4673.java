package baekjoon_Function;

public class baekjoon_4673 {

    public static void main(String[] args) {

    boolean[] checkfunction = new boolean[10001];   // 1부터 10000까지

    for(int i=1; i<10001; i++){
        int n = d(i);

        if(n<10001){
            checkfunction[n] = true;
        }
    }

        StringBuilder sb = new StringBuilder();

        for(int i=1; i<10001; i++){
            if(!checkfunction[i]){
                sb.append(i).append('\n');
            }
        }
        System.out.println(sb);
    }

    public static int d(int number){
        int sum = number;

        while(number !=0){
            sum += (number%10); // 첫 째 자리수
            number = number/10; // 10을 나누어 첫 째 자리수를 없앤다
        }

        return  sum;
    }
}
