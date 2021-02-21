import java.util.*;
class LargeSmall{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);

		System.out.println("Enter Total Number =");
		int i;
		int total = input.nextInt(); //value put in array
		int[] x= new int[total]; // One Dimensional Array
		System.out.println("Enter "+total+" Number =");
		for(i=0;i<total;i++){
			int a = input.nextInt();
			x[i] = a;
			}

			/*Find the Large Value in the Array*/
			int large=x[0];
			for(i=0; i<total; i++){
				if(x[i]>large){
					large = x[i];
					}
				}
				System.out.println("Large Values =" +large);

				/*Small Value find in Array */

				int Small = x[0];
				for(i=0;i<total;i++){
					if(x[i]<Small){
						Small = x[i];
						}
					}
					System.out.println("Small Values =" +Small);

		}
	}
