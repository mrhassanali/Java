import java.util.Scanner;
class Factorial{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Number to Find Factorial =");
		int n = input.nextInt();

		int f=1,total;
		while(n>=1){
			f = f * n;
			n--;
			}
			System.out.println("Factorial ="+f);
	}
}