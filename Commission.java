package corejava;
import java.util.Scanner;

class Student {
    public Student() {
        System.out.println("Student object is created");
    }
}

class Commission {
    private String name;
    private String address;
    private String phone;
    private double salesAmount;

    public void acceptDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = scanner.nextLine();
        System.out.print("Enter address: ");
        address = scanner.nextLine();
        System.out.print("Enter phone: ");
        phone = scanner.nextLine();
        System.out.print("Enter sales amount: ");
        salesAmount = scanner.nextDouble();
        scanner.close();
    }

    public double calculateCommission() {
        if (salesAmount >= 100000) {
            return salesAmount * 0.10; 
        } else if (salesAmount >= 50000) {
            return salesAmount * 0.05; 
        } else if (salesAmount >= 30000) {
            return salesAmount * 0.03; 
        } else {
            return 0; 
        }
    }

    public static void main(String[] args) {
    	Student student = new Student(); 
        Commission commission = new Commission(); 
        commission.acceptDetails(); 
        double commissionAmount = commission.calculateCommission(); 
        System.out.println("Commission Amount: $" + commissionAmount);
    }
}

	

