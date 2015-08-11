import java.util.Scanner;
public class Copy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
System.out.println("請輸入一合法三角形的三邊長(請由小排到大)");
  System.out.println("A");
    int A=scn.nextInt();
  System.out.println("B");
    int B=scn.nextInt();
  System.out.println("C");
    int C=scn.nextInt('C');
if((A*A)+(B*B)==(C*C)){
  System.out.println("這是直角");
  }else{
if((A*A)+(B*B)>=(C*C)){
  System.out.println("這是銳角");
  }else{
  System.out.println("這是鈍角");	  
}	
}
}
}