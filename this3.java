import java.util.*;
class Student
{
	int roll;			//Data Members(3)			//members(5)
	String name;
	float per;


	Student()				//default Constructor
	{
		this(101,"Jay",78.56f);	// it will call parametrized constructor

		roll=0;
		name="XXX";
		per=40.0f;

		
	}
	Student(int r,String n,float p)		//parametrized constructor
	{
		roll=r;
		name=n;
		per=p;

		display();
	}
	
	void display()
	{
		
		System.out.println("Roll Number = "+roll);
		System.out.println("Name = "+name);
		System.out.println("Percentage = "+per);
		
	}
	
}
class this3
{
	public static void main(String args[ ])
	{
		Student ob1=new Student();
		ob1.display();

	}
}