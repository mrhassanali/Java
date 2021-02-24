import java.util.*;
class Sort{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		int i,j,temp;
		System.out.println("Enter Total Value");
		int n=input.nextInt();

		int[] x = new int[n];
		System.out.println("Enter "+ n+" Value");
		for(i=0;i<n;i++){
				int a=input.nextInt();
				x[i]=a;
			}
			for(i=0;i<n; i++){
				for(j=0;j<n-1; j++){
					if(x[j]>x[j+1]){
						temp=x[j];
						x[j]=x[j+1];
						x[j+1]=temp;
						}
					}
			}
			System.out.println("Array Sorting");
			for(i=0;i<n; i++){
				System.out.print(x[i]+",");
				}
				/*Line Changing*/
				System.out.println("\n");

				/*Check Even or Odd*/
				if(n%2 == 0){
					System.out.println("Even");
					int p=(n/2)-1;
					int r;
					r = p+1;
					System.out.println("x[p] ="+x[p]);
					System.out.println("x[r] ="+x[r]);
					double mm=(x[p]+x[r])/2;
					System.out.println("x[p]+x[p] ="+(x[p]+x[r]));
					System.out.println("x[p] ="+mm);
					double dd=(x[p]+x[r]);
					double dr = dd/2;
				    System.out.println(dr);
					}
					else{ // For Odd
					for(i=0;i<n; i++){
						System.out.println((i+1)+"="+x[i]);
				      }
					int odd=(n+1)/2;
					System.out.println("Median is Above "+odd+" Value");
				}
			}
	}
