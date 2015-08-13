import java.util.Scanner;
public class EX81301 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner scn=new Scanner(System.in);
float data[][]=new float[4][4];
String name[]=new String[4];
for(int i=0;i<4;i++){
  System.out.println("請輸入第"+(i+1)+"位同學的名字");
  name[i]=scn.next();
  System.out.println("請輸入3科的成績");
  data[i][0]=scn.nextFloat();
  data[i][1]=scn.nextFloat();
  data[i][2]=scn.nextFloat();
  data[i][3]=(data[i][0]+data[i][1]+data[i][2])/3;
  }
  System.out.println("全班資料如下");
   for(int i=0;i<4;i++){
   System.out.println(name[i]+"\t"+data[i][1]+"\t"+data[i][2]+"\t"+data[i][3]);
   }
  
   }
   }

