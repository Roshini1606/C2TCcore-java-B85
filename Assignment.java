package corejava;

	import com.Roshini.assignment.employees.Manager;
	import com.Roshini.assignment.employees.Developer;
	import com.Roshini.assignment.utilities.EmployeeUtilities;

	public class Assignment {
	    public static void main(String[] args) {
	        // Creating instances of Manager and Developer
	        Manager manager = new Manager("John Doe", 1001, 80000, "Engineering");
	        Developer developer = new Developer("Jane Smith", 2001, 60000, "Java");

	        // Using EmployeeUtilities methods
	        EmployeeUtilities.increaseSalary(manager, 10); // Increase manager's salary by 10%
	        EmployeeUtilities.displayManagerDetails(manager);
	        System.out.println();
	        EmployeeUtilities.displayDeveloperDetails(developer);
	    }
	}


