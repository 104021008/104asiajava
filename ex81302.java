import java.util.Scanner;
public class ex81302 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
float max=0;float min=99;
float data[][]=new float[5][5];
String name[]=new String[5];
 for(int i=0;i<5;i++){
 System.out.println("�п�J�ǥͦW�r");
 name[i]=scn.next();
 System.out.println("�п�J���Z");
data[i][0]=scn.nextFloat();
data[i][1]=scn.nextFloat();
data[i][2]=scn.nextFloat();
data[i][3]=(data[i][0]+data[i][1]+data[i][2])/3;
 }
 System.out.println("���Z�����Z�p�U");
 for(int i=0;i<4;i++){
 System.out.println(name[i]+"\t"+data[i][1]+"\t"+data[i][2]+"\t"+data[i][3]);

 }
 int a=0;int b=0;
 for(int i=0;i<5;i++){
  if(data[i][3]<60){
  a++;
 }else{
   b++;
 }
  
 }
 System.out.println("�������ή�"+a+"�H");
 System.out.println("�����ή�"+b+"�H");
 
for(int t=0;t<5;t++){
	  if(data[t][3]>max){
		  max=data[t][3];

}
if(data[t][3]<min){
	min=data[t][3];
	
}
System.out.println("�̰���"+max+"��");
System.out.println("�̧C��"+min+"��");

}
}}





