import java.util.Scanner;
public class math3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn=new Scanner(System.in);
        System.out.println("�п�J����");
        float H=scn.nextFloat();
        System.out.println("�п�J�魫");
        float W=scn.nextFloat();
        if(H>165&&W<45){
          System.out.println("�i�H�l�D");
        }
        else{if(H<165&&W<45){
        System.out.println("���ŦX");
        }
        else{if(H>165&&W>45){
        System.out.println("���ŦX");
        } 
        else
        System.out.println("���n�N��");
        	
        }

	}

}}
