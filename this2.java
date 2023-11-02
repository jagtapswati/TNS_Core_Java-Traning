import java.util.*;
class Student
{
	int roll;			//Data Members(3)			//members(5)
	String name;
	float per;


	Student()				//default Constructor
	{
		roll=0;
		name="XXX";
		per=40.0f;
	}
	Student(int roll,String name,float per)		//parametrized constructor
	{
		this.roll=roll;
		this.name=name;
		this.per=per;
	}
	
	void display()
	{
		
		System.out.println("Roll Number = "+roll);
		System.out.println("Name = "+name);
		System.out.println("Percentage = "+per);
		
	}
	
}
class this2
{
	public static void main(String args[ ])
	{
		Student ob1=new Student(1,"Jay",78.67f);
		
		ob1.display();

	}
}