
public class Employee {
	private String firstname;
	private String lastname;
	private double monthlysalary;
	private double yearlysalary;
	private double raisedsalary;
	
	public Employee(String first, String last, double salary){
		firstname = first;
		lastname = last;
		monthlysalary = salary;
		yearlysalary = 12 * monthlysalary;
		raisedsalary = yearlysalary * 0.1 + yearlysalary;
	}
	
	public void setfirstname(String newfirstname){
		firstname = newfirstname;
	}
	public void setlastname(String newlastname){
		lastname = newlastname;
	}
	public void setmonthlysalary(double newmonthlysalary){
		monthlysalary = newmonthlysalary;
	}
	public String getfName(){
		return firstname;
	}
	public String getlName(){
		return lastname;
	}
	public double getSalary(){
		return yearlysalary;
	}
	public double getraiseSalary(){
		return raisedsalary;
	}
}


