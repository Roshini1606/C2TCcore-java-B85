package corejava;

import java.util.Scanner;
public class IfElseDemo {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
	System.out.println("enter the age:");
	int age=sc.nextInt();
	
	if(age>=18)
	{
		System.out.println("Eligible for voting");
		System.out.println("Bring your voter id");
	}
	else {
		System.out.println("you are under age");
		System.out.println("wait until your 18");
	}
	System.out.println("VOTE FOR INDIA");
	}
	
	}


