import java.util.Scanner;
public class math {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn=new Scanner(System.in);
		System.out.print("�п�J�A�������");
		double a=scn.nextDouble();
		double b=scn.nextDouble();
		if(a==b){
			System.out.println(a+"�P"+b+"�۵�");
		}else if(a<b){
			System.out.println(a+"�p��"+b);
		}else{
			System.out.println(a+"�j��"+b);
		}
		System.out.println("�аݧA�n�p��p��");
        String c=scn.next();
        
        if(c.equals("+")){
        	
        	System.out.println("���׬�"+(a+b));
        	
        }
        
	}
}	
         
