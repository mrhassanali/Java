import java.util.*;
class swap{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter value of A= ");
		int a = input.nextInt(); //input value a
		System.out.print("Enter the value of B= ");
		int b = input.nextInt(); //input value b
		System.out.println("\n");  // change the line space
		System.out.println("Swap Values");
		int temp;
		temp = a;  //a value are assign to temp
		a = b;     // b value are assign to a
		b = temp;  // temp value of a are assign to b
		System.out.println("Values of A ="+a);
		System.out.println("Values of B ="+b);
		}
	}