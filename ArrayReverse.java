import java.util.*;
class ArrayReverse{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter value size of Array= ");
		int size = input.nextInt();
		int x[] = new int[size];
		int i;
		System.out.println("Input the Array of a size is "+size);
		for(i=0; i<=size-1; i++){
			System.out.print("x["+i+"] =");
			int a  = input.nextInt();
			x[i] = a;
			}
			System.out.println("\n");
			System.out.println("Array Reverse");
			for(i=size-1; i>=0; i--){
			System.out.println("x["+i+"] ="+x[i]);
			}
		}
	}