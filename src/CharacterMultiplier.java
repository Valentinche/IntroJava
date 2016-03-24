import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String first = input.next("\\w+");
        String second = input.next("\\w+");
        System.out.println(findingProduct(first, second));


    }

    private static int findingProduct(String first, String second) {
        int product = 0;
        if (first.length() == second.length()) {
            for (int i = 0; i < first.length(); i++) {
                product += first.charAt(i) * second.charAt(i);
            }
        } else if (first.length() > second.length()) {
            for (int i = 0; i < second.length(); i++) {
                product += first.charAt(i) * second.charAt(i);
            }
            for (int i = second.length(); i < first.length(); i++) {
                product += first.charAt(i);
            }

        } else {
            for (int i = 0; i < first.length(); i++) {
                product += first.charAt(i) * second.charAt(i);
            }
            for (int i = first.length(); i < second.length(); i++) {
                product += second.charAt(i);
            }

        }


        return product;
    }
}
