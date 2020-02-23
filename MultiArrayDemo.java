import java.util.*;
public class MultiArrayDemo
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		int[][] multiArr=new int[2][2];
		System.out.println("Enter value of Array(size2*2)");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.println("At Index "+i+","+j);
				multiArr[i][j]=scanner.nextInt();
			}
		}
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(multiArr[i][j]+"\t");	
			}
			System.out.println();
		}
	}
}