import java.util.Scanner;
public class Helllow {
	public static void main(String [] args)
	{
		float value=1;
		int i;
		System.out.println("Enter the number");
	Scanner sc=new Scanner(System.in);
	float a=sc.nextFloat();
	System.out.println("Eter trhe value of Power");
	int n=sc.nextInt();

	if(n>0)
	{for(i=1;i<=n;i++)
	{
		value=value*a;
	}
	System.out.println("the number is="+a+" the value is="+value);
		}
	else {
		System.out.println("Check the Power");
	}
	
	}

}
