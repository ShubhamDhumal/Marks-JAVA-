import java.util.*;
public class AddArrayDemo1
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		int[]arr= new int[3];
		int[]arr1=new int[3];
		int[]sum=new int[3];
		System.out.println("Enter Numbers for 1st Array :");
		for(int i=0;i<3;i++)
		{
			arr[i]=scanner.nextInt();
		}
		System.out.println("Enter Numbers for 2nd Array :");
		for(int i=0;i<3;i++)
		{
			arr1[i]=scanner.nextInt();
		}
		System.out.println("Numbers of 1st Array : ");
		for(int i=0;i<3;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("Numbers of 2nd Array : ");
		for(int i=0;i<3;i++)
		{
			System.out.println(arr1[i]);	
		}
		System.out.println("Addition of 2 Arrays :");
		for(int i=0;i<3;i++)
		{
			sum[i]=arr[i]+arr1[i];
			System.out.print(sum[i]+"\t");
		}
	}	
}