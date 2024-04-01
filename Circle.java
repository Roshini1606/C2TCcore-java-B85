package corejava;
	import java.util.Scanner;

	public class Circle {
	    private double radius;
	    private String colour;

	    public Circle() {
	        radius = 0;
	        colour = "";
	    }

	    public void getInput() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the radius of the circle: ");
	        radius = scanner.nextDouble();
	        System.out.print("Enter the colour of the circle: ");
	        colour = scanner.next();
	    }

	    public void calcArea() {
	        double area = Math.PI * radius * radius;
	        System.out.println("Area of the circle with radius " + radius + " is: " + area);
	    }

	    public static void main(String[] args) {
	        Circle myCircle = new Circle();
	        myCircle.getInput();
	        myCircle.calcArea();
	    }
	}


