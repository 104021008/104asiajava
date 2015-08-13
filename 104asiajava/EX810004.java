import java.util.Scanner;
public class EX810004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
int t=1;
double w=20000; 
while(w<1100000){
  w=w+w*0.15;
  t=t+1;
}
System.out.println(t+"點時達到的滿水位");
	}

}
