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
				System.out.println(x[i]);
				}

			}
	}
	
