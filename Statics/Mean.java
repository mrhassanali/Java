import java.util.*;
class Mean
{
   public static void main(String args[])
    {
		Scanner input=new Scanner(System.in);
		System.out.println("                         Mean = Sum of All Numbers/Total Numbers");
		System.out.println("Enter a number");
		int n=input.nextInt();
		double[] x=new double[n];
		System.out.println("enter "+n+" elements");
		double sum=0;
		for(int i=0;i<n;i++)
		{
			x[i]=input.nextDouble();
			sum=sum+x[i];
		}
		   System.out.println("Mean :"+(sum/n));
		}
}
