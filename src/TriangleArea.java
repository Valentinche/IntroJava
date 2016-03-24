import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int aX=input.nextInt();
        int aY=input.nextInt();
        int bX=input.nextInt();
        int bY=input.nextInt();
        int cX=input.nextInt();
        int cy=input.nextInt();
        int result=(aX*(bY-cy)+bX*(cy-aY)+cX*(aY+bY))/2;
        //A	x 	 (	 B	y 	−	 C	y 	) 	+	 B	x 	 (	 C	y 	−	 A	y 	) 	+	 C	x 	 (	 A	y 	−	 B	y 	)
        //2
        System.out.println(Math.abs(result));




    }
}
