import java.util.Scanner;
import java.util.Random;
public class EX81105 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		Random rnd=new Random();
int data[]=new int[20];
int a=0;int b=0;int o=0;
     for(int i=0;i<20;i++){
	 data[i]=(rnd.nextInt(20)-10); 
}
     for(int k=0;k<20;k++){
       if(data[k]>0){
    	 a++;
       }else{
       if(data[k]<0){
    	 b++;  
       }else{
    	   o++;
       }
    	   
       }
     }
     for(int h=0;h<20;h++)
      System.out.println(data[h]);
      System.out.println("正值"+a+"個");
      System.out.println("負值"+b+"個");
      System.out.println("為0的數"+o+"個");
     
      
	}
}
