import java.util.Scanner;
public class main {
	public static void main(String[] args){
		System.out.printf("Input a radius(integer):");
		Scanner input = new Scanner(System.in);
		int r = input.nextInt();
		float PI = 3.14f;
		double Area = PI * r * r;
		System.out.printf("Area = %.25f * %d * %d\n",PI, r, r);
		System.out.printf("Area = %.2f\n", Area);
	}
}
