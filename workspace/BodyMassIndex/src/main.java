import java.util.Scanner;
public class main {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.printf("input your weight:");
		float weight = input.nextInt();
		System.out.printf("input your height:");
		int height = input.nextInt();
		double BMI = (weight  * 703) / (height * height);
		System.out.printf("BMI VALUES\nUnderweight: less than 18.5\nNormal: between 18.5 and 24.9\nOverweight: between 25 and 29.9\nObese: 30 or greater\n");
		System.out.printf("your BMI: %.1f\n", BMI);
		System.out.printf("Status:");
		if(BMI < 18.5){
			System.out.printf("Underweight");
		}
		else if (BMI >= 18.5 && BMI <= 24.9){
			System.out.printf("Nomral");
		}
		else if (BMI >= 25 && BMI <= 29.9){
			System.out.printf("Overweight");
		}
		else 
			System.out.printf("Obese");
		
	}
}
