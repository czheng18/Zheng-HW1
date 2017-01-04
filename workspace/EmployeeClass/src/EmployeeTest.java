
public class EmployeeTest {
	public static void main(String[] args){
		Employee emp1 = new Employee("Chen","Zheng",5000);
		System.out.printf("Employee1:\n");
		System.out.println("First Name: " + emp1.getfName()+"\nLast Name: " +emp1.getlName()+ "\nYearly Salary:  " + emp1.getSalary());
		System.out.println("After 10% raise: " + emp1.getraiseSalary());
		System.out.printf("\n");
		Employee emp2 = new Employee("Luke", "Skyewalker",8000);
		System.out.printf("Employee2:\n");
		System.out.println("First Name: " + emp2.getfName()+"\nLast Name: " +emp2.getlName()+ "\nYearly Salary:  " + emp2.getSalary());
		System.out.println("After 10% raise: " + emp2.getraiseSalary());
	
	}
}
