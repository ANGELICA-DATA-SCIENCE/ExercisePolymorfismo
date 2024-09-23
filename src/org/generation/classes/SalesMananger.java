package org.generation.classes;

public class SalesMananger extends Employee {
	private double salesMade;
	

	public SalesMananger(String firstName, String lastName, int registration, int age, int daysWorked,
			int vacationDaysTaken, double salary, int yearsWork, double salesMade) {
		super(firstName, lastName, registration, age, daysWorked, vacationDaysTaken, salary, yearsWork);
		this.salesMade = salesMade;
	}


	public double getSalesMade() {
		return salesMade;
	}


	public void setSalesMade(double salesMade) {
		this.salesMade = salesMade;
	}


	@Override
	public String toString() {
		return "SalesMananger [salesMade=" + salesMade + ", getFirstName()=" + getFirstName() + ", getLastName()="
				+ getLastName() + ", getRegistration()=" + getRegistration() + ", getAge()=" + getAge()
				+ ", getDaysWorked()=" + getDaysWorked() + ", getVacationDaysTaken()=" + getVacationDaysTaken()
				+ ", getSalary()=" + getSalary() + ", getYearsWork()=" + getYearsWork() + "]";
	}
	
}
