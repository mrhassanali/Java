import java.util.*;
class Combination{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("                 Combination = n!/r!(n-r)!  ");
		/*Combination = n!/r!(n-r)!*/
		System.out.print("Enter the Total Number n =");
		int n = input.nextInt();
		System.out.print("Enter the Object r =");
		int r = input.nextInt();

		/*Factorial */
		int f = 1;
		while(n>=1){
			f=f*n;
			n--;
			}

			/*Finding---> r!*/
		System.out.println("n! ="+f);
		int f2=1;
		while(r>=1){
			f2=f2*r;
			r--;
			}
			System.out.println("r! =" +f2);

			/*Finding --->(n-r)!*/
			int find = n-r;
			System.out.println("(n-r) ="+find);
			int f3=1;
			while(find>=1){
				f3 =f3* find;
				find--;
				}
			System.out.println("(n-r)! ="+f3);

			/*Final Calculation*/
			int calculation = f/f2*f3;
			System.out.println("Combination = n!/r!(n-r)! ="+calculation);
		}
	}
