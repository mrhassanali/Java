import java.util.*;
class EvenNumber{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("You can Input Start Number and End Number Program Show you the Number Between Start to End Even Number");
		System.out.print("Enter Start From =");
		int m = input.nextInt();
		int n = 2;
		System.out.print("to =");
		int length = input.nextInt();

		int i;
		for(i=m; i<=length; i++){
			if(i%n==0){
				System.out.println(i);
				}
			}
		}
	}