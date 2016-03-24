import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class RandomizeNtoM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int M = input.nextInt();

        int biggerNum = 0;
        int smallerNum = 0;
        if (N > M) {
            biggerNum = N;
            smallerNum = M;
        } else if (N < M) {
            biggerNum = M;
            smallerNum = N;

        } else {
            System.out.println(N);
        }
        List<Integer> num = new ArrayList<>();
        for (int i = smallerNum; i <= biggerNum; i++) {
            num.add(i);
            Collections.shuffle(num);

        }
        for (int item : num) {
            System.out.print(item+" ");
        }


    }
}
