package corejava;
import java.util.Scanner;

		public class Sample {
		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		        // Getting full name with initial from user
		        System.out.print("Enter your full name with initial: ");
		        String fullName = sc.nextLine();
		        System.out.println("Enter your rollnumber:");
		        int rollNumber =sc.nextInt() ;
		        System.out.println("Enter your Grade:");
		        char grade = sc.next().charAt(0);
		        System.out.println("Enter your Percentage:");
		        double percentage =sc.nextDouble();
		        System.out.println(fullName);
		        System.out.println(rollNumber);
		        System.out.println(grade);
		        System.out.println(percentage);
		        sc.close();
		    }

	}


