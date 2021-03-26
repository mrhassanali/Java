import java.util.Scanner;
class Search{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Size of Array");
		int size = input.nextInt();
		int x[] = new int[size];

		int i;
		for(i=0;i<size;i++){
			System.out.print("x["+i+"] = ");
			int a = input.nextInt();
			x[i] = a;
			}

			System.out.println("Search Value in the Array");
			int item = input.nextInt();

			/*Method No 1*/
			i=0;
			while(i<size && x[i]!= item){
				i++;
				}
				if(i<size){
					System.out.println("Item Found in index = "+i);
					}else{
						System.out.println("Item not Found");
						}
				/*Method No 2*/
			for(i=0; i<size; i++){
				if(x[i]==item){
					System.out.println("Item Search on Index = "+i);
					}
				}
		}
	}