import java.util.Scanner;
import java.util.Random;
public class EX81101 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn=new Scanner(System.in);
		Random rnd=new Random();
		
		System.out.println("請輸入幾個偶數");
	    int a=rnd.nextInt();
		int data[]=new int[10];		
		int c=0;int n=0;
		 for(int i=0;i<10;i++){
		  
			 data[i]=rnd.nextInt(100); 
		  if(data[i]%2==0){
			 c++;
		  }else{
			  n++;
		  }
		  } 
		 int t=0;
		 while(t<3){
		 System.out.println("請猜");
		 int e=scn.nextInt();
		 if(e==c){
	     System.out.println("正確");
		 t=3;
		 }else{ 
		 System.out.println("錯誤");
		 
		 t++;
		 }
		 }
		 System.out.println("你輸了");
		 for(int k=0;k<10;k++)
		 System.out.println(data[k]);   
        }
	   }
	   
	

