package main;
import java.util.Scanner;

class Courses 
{
	public String displayCourseDetails(String dept) 
	{		
			return "You have chosen "+dept+" department.\nThe common subjects are:\n1. Engineering Mathematics\n2. Physics\n3. Chemistry\n";
	}
}

class ECE extends Courses 
{ 
	public String displayCourseDetails(String dept) 
	{
		String commonSubjects = super.displayCourseDetails(dept);
		String subject1 = "Microprocessor"; 
		String subject2 = "Linear Integrated Circuits"; 
		
		String specificSubjects = " specific subjects are:\n4. "+subject1+"\n5. "+subject2;
		return commonSubjects+dept+specificSubjects;
		
	}
}
class Mechanical extends Courses 
{  
	public String displayCourseDetails(String dept) 
	{ 
		String commonSubjects = super.displayCourseDetails(dept);
		String subject1 = "Fluid Mechanics"; 
		String subject2 = "Thermodynamics"; 
		
		String specificSubjects = " specific subjects are:\n4. "+subject1+"\n5. "+subject2;
		return commonSubjects+dept+specificSubjects;	
	}
}
class CSE extends Courses  
{  
	public String displayCourseDetails(String dept) 
	{
		String commonSubjects = super.displayCourseDetails(dept);
		String subject1 = "Network Theory"; 
		String subject2 = "Operating Systems"; 
		
		String specificSubjects = " specific subjects are:\n4. "+subject1+"\n5. "+subject2;
		return commonSubjects+dept+specificSubjects;		
	}
}

public class Question1 
{
	public static void main(String[] args)
	{
		System.out.println("Departments:");
		System.out.println(" 1) ECE \n 2) Mechanical \n 3) CSE");
		System.out.println("Choose the department:");
		Scanner in = new Scanner(System.in);
		int choice = in.nextInt();
		Question1 mn=new Question1();
		switch(choice) 
		{
			case 1:
					ECE e=new ECE();
					System.out.println(e.displayCourseDetails("ECE"));
					break;
			case 2:
					Mechanical m=new Mechanical();
					System.out.println(m.displayCourseDetails("Mechanical"));
					break;
			case 3:
					CSE c=new CSE();
					System.out.println(c.displayCourseDetails("CSE"));
					break;
			default:
					System.out.println("Invalid input!");
					break;
		}
	}
}