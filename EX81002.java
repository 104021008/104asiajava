import java.util.Scanner;

public class EX81002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
   System.out.println("½Ð¿é¤J¼Æ¦r");
   int n=scn.nextInt();
   double v1=Math.ceil(n/2);
   double v2=n-v1;
      for(int i=0;i<=v1;i++){
	  for(int j=0;j<=v1-i-1;j++){
		System.out.print(" ");
	  }
       for(int k=0;k<=2*i;k++){
    	 System.out.print("*");  
       }
      System.out.println();
      }
      for(int i=1;i<=v1;i++){
    	  for(int m=0;m<i;m++){
    		System.out.print(" ");
    	  }
           for(int a=0;a<=2*i;a++){
        	 System.out.print("*");  
           }
          System.out.println();
          }
      }

}