import java.util.Scanner;

public class meat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn=new Scanner(System.in);
		System.out.println("請輸入星期");
		int W=scn.nextInt();
		System.out.println("請輸入日期");
		int D=scn.nextInt();
		if(D==7&&D==17&&D==27||D<=31){
		System.out.println("吃肉");
		}else{
		if(W==2&&W==4&&W==6||D>=1){
		System.out.println("今天吃素");
		}else{
		System.out.println("吃肉阿");	

	}

}
}
}