import java.util.Scanner;
public class EX81005 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
 System.out.println("請輸入年分");
 int y=scn.nextInt();
 while((y%4!=0)||(y%100==0&&y%400!=0)){
	 System.out.print("請輸入年份");
  y=scn.nextInt();	 
 }
System.out.println("好厲害");
	}
}
