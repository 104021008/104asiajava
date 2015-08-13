import java.util.Scanner;
public class math3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn=new Scanner(System.in);
        System.out.println("請輸入身高");
        float H=scn.nextFloat();
        System.out.println("請輸入體重");
        float W=scn.nextFloat();
        if(H>165&&W<45){
          System.out.println("可以追求");
        }
        else{if(H<165&&W<45){
        System.out.println("不符合");
        }
        else{if(H>165&&W>45){
        System.out.println("不符合");
        } 
        else
        System.out.println("不好意思");
        	
        }

	}

}}
