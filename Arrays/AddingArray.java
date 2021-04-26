import java.io.*;
public class AddingArray{
    public static void main(String[]args)throws Exception
    {
        BufferedReader str=new BufferedReader(new InputStreamReader(System.in));
        String s;
        int i,sum=0,n;
        int [] array=new int[10];
        System.out.println("Enter the Ten Number");
        for(i=0;i<=9;i++)
        {
			s=str.readLine();
			n=Integer.parseInt(s);
			array[i]=n;
        }
        for(i=0;i<=9;i++)
        {
            sum=sum+array[i];
        }
        System.out.println("Sum="+sum);
    }
}