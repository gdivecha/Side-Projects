import java.util.Scanner;

public class Program
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		char[] arr = text.toCharArray();
		
		char[] newArr = new char[arr.length];
		int count = 0;
		for(int i=(arr.length-1);i>=0;i--){
			newArr[count] = arr[i];
			count++;
		}
		String toReturn = "";
		for(int i=0; i<arr.length; i++){
			toReturn+=newArr[i];
		}
		System.out.println(toReturn);
	}
}
