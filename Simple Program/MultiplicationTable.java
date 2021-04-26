import java.util.Scanner;
class MultiplicationTable{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Number to Find Multiplication =");
		int n = input.nextInt();
		System.out.print("Length of Multiplication = ");
		int length = input.nextInt();
		int i,total;
		for(i=1; i<=length; i++){
			total = i*n;
			System.out.println(n+" x "+i+" = "+total);
			}
		}
	}