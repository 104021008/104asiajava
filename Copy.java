import java.util.Scanner;
public class Copy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
System.out.println("�п�J�@�X�k�T���Ϊ��T���(�ХѤp�ƨ�j)");
  System.out.println("A");
    int A=scn.nextInt();
  System.out.println("B");
    int B=scn.nextInt();
  System.out.println("C");
    int C=scn.nextInt('C');
if((A*A)+(B*B)==(C*C)){
  System.out.println("�o�O����");
  }else{
if((A*A)+(B*B)>=(C*C)){
  System.out.println("�o�O�U��");
  }else{
  System.out.println("�o�O�w��");	  
}	
}
}
}