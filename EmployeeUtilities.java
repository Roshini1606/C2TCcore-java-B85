package com.Roshini.assignment.utilities;
	import com.Roshini.assignment.employees.Employee;
	import com.Roshini.assignment.employees.Manager;
	import com.Roshini.assignment.employees.Developer;

	
	public class EmployeeUtilities {
	  
	    public static void increaseSalary(Employee employee, double percentage) {
	        double currentSalary = employee.getSalary();
	        double increment = currentSalary * percentage / 100;
	        double newSalary = currentSalary + increment;
	        employee.setSalary(newSalary);
	    }

	   
	    public static void displayManagerDetails(Manager manager) {
	        System.out.println("Manager Name: " + manager.getName());
	        System.out.println("Manager ID: " + manager.getEmployeeId());
	        System.out.println("Manager Salary: " + manager.getSalary());
	        System.out.println("Manager Department: " + manager.getDepartment());
	    }

	
	    public static void displayDeveloperDetails(Developer developer) {
	        System.out.println("Developer Name: " + developer.getName());
	        System.out.println("Developer ID: " + developer.getEmployeeId());
	        System.out.println("Developer Salary: " + developer.getSalary());
	        System.out.println("Developer Programming Language: " + developer.getProgrammingLanguage());
	    }
	}


