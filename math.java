import java.util.Scanner;
public class math {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn=new Scanner(System.in);
		System.out.print("請輸入你的比較式");
		double a=scn.nextDouble();
		double b=scn.nextDouble();
		if(a==b){
			System.out.println(a+"與"+b+"相等");
		}else if(a<b){
			System.out.println(a+"小於"+b);
		}else{
			System.out.println(a+"大於"+b);
		}
		System.out.println("請問你要如何計算");
        String c=scn.next();
        
        if(c.equals("+")){
        	
        	System.out.println("答案為"+(a+b));
        	
        }
        
	}
}	
         
