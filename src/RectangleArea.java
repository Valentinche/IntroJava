import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Write two sides of Rectangle :" );
        int aSide=input.nextInt();
        int bSide=input.nextInt();
        int area=aSide*bSide;
        System.out.printf("The area of rectangle is: %d",area);


    }

}
