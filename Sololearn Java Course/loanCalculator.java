import java.util.Scanner;

public class Program
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int amount = scanner.nextInt();
		int original = amount;
		//your code goes here
		int interest = 0;
		for(int i=0; i<3; i++){
			interest+=(amount*0.1);
			amount*=0.9;
		}
		System.out.println(original-interest);
	}
}
