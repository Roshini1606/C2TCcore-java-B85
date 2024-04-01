package corejava;
import java.util.Scanner;
public class SwitchDemo {
	public static void main(String[] arg)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter x");
		char x =sc.next().charAt(0);
		switch(x)
		{
		case 'l':
		case 'L':System.out.println("x is a LETTER");
		       break;
		case 'd':
		case 'D':System.out.println("x is a DIGIT");
		       break;
		default:System.out.println("x is neither LETTER nor DIGIT");
		        break;
		}
	}

}
