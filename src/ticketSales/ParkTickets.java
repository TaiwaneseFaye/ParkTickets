//Park Ticket Assignment
//Chris Sun
//Ask the user for amount of tickets then calculate total costs then output total cost back out.
package ticketSales;
import java.util.Scanner;

public class ParkTickets {
	
	static final double PREKPRICE=5.00;
	static final double STUDENTPRICE=25.00;
	static final double ADULTPRICE=35.0;
	static final double SENIORPRICE=25.0;
	static final double TAXRATE=0.0825;

	private	int	numPREK=0;		
	private	int	numSTUDENT=0;		
	private	int	numADULT=0;		
	private	int	numSENIOR=0;		
	private	double	effTaxRate=1.0825;		
	private	int	giftCert=0;		
	private	double costPREK=0.0;		
	private	double costSTUDENT=0.0;		
	private	double costADULT=0.0;		
	private	double costSENIOR=0.0;		
	private	double subTotalCost=0.0;		
	private	double totalCost=0.0;		
	private Scanner input = new Scanner(System.in);		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ParkTickets();//starts everything
	}
	public ParkTickets() {
		process();//runs the process method
		performCalculations();//runs the perform calculations method
		displayTotalCost();//runs the display total cost method
	}
	
	private void process() {
		numADULT = userInput(" Adult tickets ", " want");//asking how many adult tickets 
		numPREK = userInput(" Pre-K tickets ", " want");//asking how many pre-k tickets
		numSTUDENT = userInput(" Student tickets ", " want");//asking how many student tickets
		numSENIOR = userInput(" Senior tickets ", " want");//asking how many senior tickets
		giftCert = userInput(" Gift Certificates ", " want");//asking how many gift certificates
	}
	private int userInput(String ticketName, String verb) {	//method used to ask the user how many tickets									
		System.out.println("How many" + ticketName + "do you" + verb + "? Enter a number here: ");								
		int numObjects=input.nextInt();	
		return numObjects;
	}
	private void displayTotalCost()	{
		System.out.println("Your purchase of " + numPREK + " Pre-K Tickets, " + numSTUDENT 
				+ " Student Tickets, " + numADULT + " Adult Tickets, " + numSENIOR 
				+ " Senior Tickets, with " + giftCert + " Gift Certificates is $" + String.format("%.2f", totalCost));	//outputs all the info back to the user
	}
	private void performCalculations() {
		costPREK = numPREK * PREKPRICE;//getting the cost of tickets for all Pre-K's
		costSTUDENT = (numSTUDENT-giftCert) * STUDENTPRICE;//getting the cost of ticket for Students after subtracting gift certificates from student count
		costADULT = numADULT * ADULTPRICE;//getting the cost of tickets for adults
		costSENIOR = numSENIOR * SENIORPRICE;//getting the cost of tickets for seniors
		subTotalCost = costPREK+costSTUDENT+costADULT+costSENIOR;//adding the cost of all tickets together before tax
		totalCost = subTotalCost * effTaxRate;//getting the total of all tickets with tax
	}

}

