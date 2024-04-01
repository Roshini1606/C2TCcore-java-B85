package corejava;


	import java.util.Scanner;

	public class TicketBooking {
	    private String stageEvent;
	    private String customer;
	    private int noOfSeats;

	    // Default constructor
	    public TicketBooking() {
	        this.stageEvent = "";
	        this.customer = "";
	        this.noOfSeats = 0;
	    }

	    // Parameterized constructor
	    public TicketBooking(String stageEvent, String customer, int noOfSeats) {
	        this.stageEvent = stageEvent;
	        this.customer = customer;
	        this.noOfSeats = noOfSeats;
	    }

	    // Getters and setters
	    public String getStageEvent() {
	        return stageEvent;
	    }

	    public void setStageEvent(String stageEvent) {
	        this.stageEvent = stageEvent;
	    }

	    public String getCustomer() {
	        return customer;
	    }

	    public void setCustomer(String customer) {
	        this.customer = customer;
	    }

	    public int getNoOfSeats() {
	        return noOfSeats;
	    }

	    public void setNoOfSeats(int noOfSeats) {
	        this.noOfSeats = noOfSeats;
	    }

	    // Method for cash payment
	    public void makePayment(Double amount) {
	        System.out.println("stageEvent:"+stageEvent+"\n Customer " +  customer + "\n Number of seats: " + noOfSeats + "\n Amount " + amount +
	                " paid in cash");
	    }

	    // Method for wallet payment
	    public void makePayment(String walletNumber, Double amount) {
	        System.out.println("stageEvent:"+stageEvent+ "\n Customer " + customer + "\n Number of seats: " + noOfSeats + "\n Amount " + amount +
	                " paid using wallet number " + walletNumber);
	    }

	    // Method for credit card payment
	    public void makePayment(String name, Double amount, String creditCard, String ccv) {
	        System.out.println("stageEvent:"+stageEvent+"\n Customer " + customer + "\n Number of seats: " + noOfSeats + "\n Amount " + amount +
	                " paid using " + creditCard + " card" + "\n Holder name:" + name + "\n CCV:" + ccv);
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Read ticket booking details
	        String ticketBookingInput = scanner.nextLine();
	        String[] ticketBookingDetails = ticketBookingInput.split(",");
	        TicketBooking ticketBooking = new TicketBooking(ticketBookingDetails[0], ticketBookingDetails[1],
	                Integer.parseInt(ticketBookingDetails[2]));

	        // Read payment mode
	        int paymentMode = scanner.nextInt();
	        scanner.nextLine(); // Consume newline character

	        switch (paymentMode) {
	            case 1:
	                double cashAmount = scanner.nextDouble();
	                ticketBooking.makePayment(cashAmount);
	                break;
	            case 2:
	                // Wallet payment
	                double walletAmount = scanner.nextDouble();
	                scanner.nextLine(); // Consume newline character
	                String walletNumber = scanner.nextLine();
	                ticketBooking.makePayment(walletNumber, walletAmount);
	                break;
	            case 3:
	                String cardholderName = scanner.nextLine();
	                double creditCardAmount = scanner.nextDouble();
	                scanner.nextLine(); // Consume newline character
	                String creditCardType = scanner.nextLine();
	                String ccv = scanner.nextLine();
	                ticketBooking.makePayment(cardholderName, creditCardAmount, creditCardType, ccv);
	                break;
	            default:
	                System.out.println("Invalid choice");
	        }
	    }
	}



