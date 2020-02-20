public class EmpSal2
{
	public static void main(String args[])
	{
		int Sal;
		char Gen=args[0].charAt(0);
		char Ot=args[1].charAt(0);
		System.out.println("General shift attendance: "+Gen);
		System.out.println("Over time attendance: "+Ot);
		if((Gen=='P' || Gen=='p')&&(Ot=='P' || Ot=='p'))
		{
			Sal=1500;
			System.out.println("Your Daily Wage is: "+Sal);
		}
		else if((Gen=='P'||Gen=='p')&&(Ot=='A'||Ot=='a'))
		{
			Sal=1000;
		 	System.out.println("Your Daily Wage is: "+Sal);
		}
		else if(Gen=='A'||Gen=='a')
		{
			Sal=0;
			System.out.println("Your Daily Wage is: "+Sal);
		}
			
	}
}
