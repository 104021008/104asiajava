import java.util.Scanner;

public class Drink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn=new Scanner(System.in);
 System.out.println("��@�a���Ʃ��a");
 String a=scn.next();
 System.out.println("�п�J�Q�ܪ�����");
 String b=scn.next();
 System.out.println("�п�J����");
 int c=scn.nextInt();
 if(a.equals("���Q�P")){
	System.out.println("���@�a��");
 }else{
 if(b!="���"||b!="�@��"){
	System.out.println("���O�a��");
 }else{	
 if(c>45){
	System.out.println("�����ݭn�F"); 
 }else 
	System.out.println("�R�a");
}
}
}
}