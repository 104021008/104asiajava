import java.util.Scanner;
public class good {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("請問梯形的上底和下底與高");
        float a=scn.nextFloat();
        float b=scn.nextFloat();
        float c=scn.nextFloat();
        float d=(a+b)*c/2;
		System.out.println("梯形面積為"+d);

	}

}
