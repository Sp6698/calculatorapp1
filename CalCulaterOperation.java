import java.util.Scanner;

public class CalCulaterOperation 
{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First no:- ");
		int n1 = sc.nextInt();
		System.out.println("Enter Second no:- ");
		int n2 = sc.nextInt();
		
		System.out.println("Addition= "+(n1+n2));
		System.out.println("Subtraction= "+(n1-n2));
		System.out.println("Multification= "+(n1*n2));
		System.out.println("Division= "+(n1/n2));
		
	}

}
