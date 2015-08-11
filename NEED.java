import java.util.Scanner;

public class NEED {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("請問三角形的底和高?");
		float a=scn.nextFloat();
		float b=scn.nextFloat();
		float c=a*b/2;
		System.out.println("三角形面積為"+c);
	}

}
