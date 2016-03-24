import java.util.Scanner;

public class CalculateExspression {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double a=input.nextDouble();
        double b=input.nextDouble();
        double c=input.nextDouble();

        double formula1=Math.pow(((a * a + b * b) / (a * a - b * b)), (a + b + c) / (Math.sqrt(c)));
        double formula2=Math.pow((a * a + b * b - Math.pow(c, 3)), a - b);

double averageofthree=(a+b+c)/3;
        double averageOfFormuls=(formula1+formula2)/2;
        double resultAverage=Math.abs(averageofthree-averageOfFormuls);
        System.out.printf("F1 result: %1$.2f; F2 result: %2$.2f; Diff: %3$.2f\n",formula1,formula2,resultAverage);

    }

}