import java.util.Scanner;
public class main {
	public static void main(String[] args){
		System.out.printf("Input an integer: ");
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		if(x % 2 == 0){
			System.out.printf("even number");
		}
		else{
			System.out.printf("odd number");
		}
	}
}
