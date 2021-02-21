import java.util.*;
public class Permutation{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in); // Creating Object

		System.out.println("                    Permutation Formula = n!/(n-r)!      ");
		System.out.print("Enter Total Number n=");
		int n = input.nextInt();
		System.out.print("Enter the r=");
		int r = input.nextInt();
		int f= 1;
		while(n>=1){
			f=f*n;
			n--;
			}
			System.out.println("Factorial n!= " +f);
			/*(n-r) = Fact*/
			int Fact;
			Fact = (n-r);
			int factorial,f2=1;
			factorial = Fact;
			while(n>=1){
				f2=f2*factorial;
				factorial--;
			}
			System.out.println("(n-r)!= " +f2);
			int permutation;
			permutation = f/f2;
			System.out.println("n!/(n-r)! =" +permutation);
		}
	}
