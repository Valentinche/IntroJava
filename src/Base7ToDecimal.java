import java.util.Scanner;

public class Base7ToDecimal {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        //int n=input.nextInt();
        String Base7=input.next();
        Integer m=Integer.valueOf(Base7,7);
        System.out.println(m);

    }
}
