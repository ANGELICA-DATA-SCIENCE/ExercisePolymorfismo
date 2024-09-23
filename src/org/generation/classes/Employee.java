package org.generation.classes;

public class Employee {
	private String firstName;
	private String lastName;
	private int registration;
	private int age;
	private int daysWorked;
	private int vacationDaysTaken;
	private double salary;
	private int yearsWork;
	
	
	public Employee(String firstName, String lastName, int registration, int age, int daysWorked, int vacationDaysTaken,
			double salary, int yearsWork) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.registration = registration;
		this.age = age;
		this.daysWorked = daysWorked;
		this.vacationDaysTaken = vacationDaysTaken;
		this.salary = salary;
		this.yearsWork = yearsWork;
	}
	
	
	
	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public int getRegistration() {
		return registration;
	}



	public void setRegistration(int registration) {
		this.registration = registration;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = (age>=18)?age:18;
	}



	public int getDaysWorked() {
		return daysWorked;
	}



	public void setDaysWorked(int daysWorked) {
		this.daysWorked = daysWorked;
	}



	public int getVacationDaysTaken() {
		return vacationDaysTaken;
	}



	public void setVacationDaysTaken(int vacationDaysTaken) {
		this.vacationDaysTaken = vacationDaysTaken;
	}



	public double getSalary() {
		return salary;
	}



	public void setSalary(double salary) {
		this.salary = salary;
	}



	public int getYearsWork() {
		return yearsWork;
	}



	public void setYearsWork(int yearsWork) {
		this.yearsWork = yearsWork;
	}



	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", registration=" + registration
				+ ", age=" + age + ", daysWorked=" + daysWorked + ", vacationDaysTaken=" + vacationDaysTaken
				+ ", salary=" + salary + ", yearsWork=" + yearsWork + ", toString()=" + super.toString() + "]";
	}
	
	
	public int timeToRetirement(){
		return age;
	    // time to retirement = min(60 - age, 40 - yearsWorked)
	 }

	 public int vacationTimeLeft(){
		return age;
	     // vacation time left = (daysWorked/360)*(30 - vacationDaysTaken)
	 }

	 public int calculateBonus(){
		return ;
	     // bonus = 2.2*salary
	 }
	
	



}




