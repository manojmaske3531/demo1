package OOPS;

public class StudentClass {
	
	public static class Student{
		
		String name;
		
		int rno;
		
		double percent;
	}

	public static void main(String[] args) {
		
		Student x = new Student();
		
		x.name = "manoj";
		x.rno = 31;
		x.percent = 84.43;
		
		System.out.println(x.name);
		System.out.println(x.rno);
		System.out.println(x.percent+8);
		
	}

}
