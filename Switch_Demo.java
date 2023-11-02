import java.util.*;
class Switch_Demo
{
	public static void main(String args[ ])
	{
		Scanner s=new Scanner(System.in);

		System.out.println("Enter any number");
		int num=s.nextInt();
	
		
		System.out.println("***** Menu ******");
		System.out.println("1. Even Odd");
		System.out.println("2. Positive Negative");
		System.out.println("3. Exit");
		System.out.println("Enter your choice");
		int ch=s.nextInt();
		
		switch(ch)
		{
			case 1:if(num%2==0)
				{
				System.out.println("Even number");
				}
				else
				{
				System.out.println("Odd NUmber");
				}
				 break;
			case 2:if(num>0)
				{
				System.out.println("It is positive number");
				}
				else
				{
				System.out.println("It is negative number");
				}
				break;
			case 3:System.exit(0);	//0 / +ve number - successful termination of pgm	
			default:System.out.println("Wrong Choice");
		}
		
	}
}