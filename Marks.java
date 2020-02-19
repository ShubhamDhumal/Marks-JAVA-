public class Marks
{
	public static void main(String[] args)
	{
		int m1,m2,m3,m4,m5;
		int a[]=new int[5];
		int tot,mks_req;
		int temp;
		float per;
		m1=Integer.parseInt(args[0]);
		m2=Integer.parseInt(args[1]);
		m3=Integer.parseInt(args[2]);
		m4=Integer.parseInt(args[3]);
		m5=Integer.parseInt(args[4]);
		tot=m1+m2+m3+m4+m5;
		System.out.println("The total Marks are "+tot);
		per=tot/5;
		System.out.println("Percentage : "+per);
		a[0]=m1;
		a[1]=m2;
		a[2]=m3;
		a[3]=m4;
		a[4]=m5;
		for (int i = 0; i < 5; i++)   
        		{  
            			for (int j = i + 1; j < 5; j++)   
            			{  
                				if (a[i] > a[j])   
                				{  
                    				temp = a[i];  
                    				a[i] = a[j];  
                    				a[j] = temp;  
                				}  
            			}  
        		}
		if(per<=60)
		{
			System.out.println("You are Fail  !!");
			System.out.println("The Subjech which has less marks are "+a[0]);
			System.out.print("To Pass You Need More ");
			mks_req=300-tot;
			System.out.println(mks_req+" marks.");
		}
		else
		{
			System.out.println("You are Passed !!");
		}
	}
}