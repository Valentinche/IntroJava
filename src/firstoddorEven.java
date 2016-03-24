import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class firstoddorEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] number = input.nextLine().split(" ");

        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < number.length; i++) {
            numbers.add(Integer.parseInt(number[i]));
        }
        String[] secondnumber = input.nextLine().split(" ");
        int change = Integer.parseInt(secondnumber[1]);
        String output = secondnumber[2];
        findingoutput(numbers, change, output);

    }

    private static int findingoutput(List<Integer> numbers, int change, String output) {
        if (output.equals("even")) {
            for (int i = 0; i < numbers.size(); i++) {
                if (numbers.get(i) % 2 == 0) {
                    System.out.print(numbers.get(i) + " ");
                    change--;
                    if (change == 0) {
                        System.exit(0);
                    }
                }
            }

        } else {
            for (int i = 0; i < numbers.size(); i++) {
                System.out.print(numbers.get(i) + " ");
                change--;
                if (change == 0) {
                    System.exit(0);
                }
            }
        }

        return 1;


    }


}

