package OOPS;
import java.util.Scanner;
public class StudentCa {
	
	public static void fun(Student x) {
		System.out.println(x.name);
		return;
	}
	
	// Creating Student class
		public static class Student 
		{
			String name;
			int rno;
			double percent;
		}
		
		// Creating a Car class
		public static class Car{
		
			String name;
			String type;
			int price;
		}
			
		public static void main(String[] args) 
		{
			Car c1 = new Car();
			c1.name = "Alto";
			c1.type = "Hachback";
			c1.price = 400000;		
			System.out.println(c1.name); 
			
			Student s1= new Student();
			s1.name = "manoj";
			s1.rno = 31;
			s1.percent = 60.88;
			fun(s1);
			
			Student s2= new Student();
			s2.name = "mangesh";
			s2.rno = 35;
			s2.percent = 78.34;  
			
		
		}
	}



