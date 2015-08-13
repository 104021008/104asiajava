import java.util.Scanner;
public class Place {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn=new Scanner(System.in);
        System.out.println("請入身分證字號英的英文");
        String str=scn.next();
	char e=scn.next().charAt(0);
switch(e){
  case 'A':
        System.out.println("台北10");
	    break;
  case 'B':
        System.out.println("台中市11");
	    break;
  case 'C':
        System.out.println("基隆市12");
        break;
  case 'D':
	    System.out.println("台南市13");
	    break;
  case 'E':
		System.out.println("高雄市14");
		  break;
  case 'F':
		System.out.println("台北縣15");
		break;
  case 'G':
		System.out.println("宜蘭縣16");
		break;
  case 'H':
		System.out.println("桃園縣17");
		break;
  case 'J':
		System.out.println("新竹縣18");
		break;
  case 'K':
		System.out.println("苗栗縣19");
		break;
  case 'L':
		System.out.println("台中縣20");
		break;
  case 'M':
		System.out.println("南投縣21");
		break;
  case 'N':
		System.out.println("彰化縣22");
		break;
  case 'P':
		System.out.println("雲林縣23");
		
}}}