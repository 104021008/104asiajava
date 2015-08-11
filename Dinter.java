import java.util.Scanner;
public class Dinter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
System.out.println("輸入上學期學分");
int A=scn.nextInt();
System.out.println("輸入下學期學分");
int B=scn.nextInt();
if((A+B)>=22){
System.out.println("在學");	
}else{
System.out.println("不及格");	

}
}
}