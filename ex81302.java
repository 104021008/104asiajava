import java.util.Scanner;
public class ex81302 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
float max=0;float min=99;
float data[][]=new float[5][5];
String name[]=new String[5];
 for(int i=0;i<5;i++){
 System.out.println("請輸入學生名字");
 name[i]=scn.next();
 System.out.println("請輸入成績");
data[i][0]=scn.nextFloat();
data[i][1]=scn.nextFloat();
data[i][2]=scn.nextFloat();
data[i][3]=(data[i][0]+data[i][1]+data[i][2])/3;
 }
 System.out.println("全班的成績如下");
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
 System.out.println("平均不及格"+a+"人");
 System.out.println("平均及格"+b+"人");
 
for(int t=0;t<5;t++){
	  if(data[t][3]>max){
		  max=data[t][3];

}
if(data[t][3]<min){
	min=data[t][3];
	
}
System.out.println("最高分"+max+"分");
System.out.println("最低分"+min+"分");

}
}}





