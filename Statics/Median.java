import java.util.*;
class Sort{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		int w,z,temp;
		System.out.println("Enter Total Value");
		int n=input.nextInt();

		int[] x = new int[n];
		System.out.println("Enter "+ n+" Value");
		for(w=0;w<n;w++){
				int a=input.nextInt();
				x[w]=a;
			}
			for(w=0;w<n; w++){
				for(z=0;z<n-1; z++){
					if(x[z]>x[z+1]){
						temp=x[z];
						x[z]=x[z+1];
						x[z+1]=temp;
						}
					}
			}
			System.out.println("Array Sorting");
			for(w=0;w<n; w++){
				System.out.print(x[w]+",");
				}
				/*Line Changing*/
				System.out.println("\n");

				/*Check Even or Odd*/
				if(n%2 == 0){
					System.out.println("Even");
					int p=(n/2)-1;
					int r;
					r = p+1;
					double mm=(x[p]+x[r])/2;
					double dd=(x[p]+x[r]);
					double dr = dd/2;
				    System.out.println("Median = "+dr);
					}
					else{ // For Odd
					for(w=0;w<n; w++){
						System.out.println((w+1)+"="+x[w]);
				      }
					int odd=(n+1)/2;
					System.out.println("Median is Above "+odd+" Value");
				}
			}
	}
