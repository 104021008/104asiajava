import java.util.Scanner;

public class Drink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn=new Scanner(System.in);
 System.out.println("選一家飲料店吧");
 String a=scn.next();
 System.out.println("請輸入想喝的飲料");
 String b=scn.next();
 System.out.println("請輸入價錢");
 int c=scn.nextInt();
 if(a.equals("五十嵐")){
	System.out.println("換一家店");
 }else{
 if(b!="綠茶"||b!="咖啡"){
	System.out.println("換別家店");
 }else{	
 if(c>45){
	System.out.println("那不需要了"); 
 }else 
	System.out.println("買吧");
}
}
}
}