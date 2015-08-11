import java.util.Scanner;

public class mot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
System.out.println("請問請腳與及兩鑾軸心的軸距和鑾胎尺寸");
float a=scn.nextFloat();
float b=scn.nextFloat();
float c=scn.nextFloat();
if(a>=43&&b==130&&c==12){
System.out.println("這是我要的車");
}else{
System.out.println("這不是我要的車");	

}

}
}