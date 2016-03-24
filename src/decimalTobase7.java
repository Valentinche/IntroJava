import java.util.Scanner;

public class decimalTobase7 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        String base7=Integer.toString(n,7);
        System.out.println(base7);

    }
}
