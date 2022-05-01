package Exam;

public class Teacher extends Person {
	int studentCount = 0;
	String subject;
	public static int count = 0;
	public Teacher() {count++;}
	public Teacher(int id, String name, String subject) {
		super(id,name);
		this.subject = subject;
		count++;
	}
	public void attendClass(Student s) {
		this.studentCount++;
	}
	public void display() {
		System.out.println("Teacher Id : "+id+", Name : "+ name+", Subject : "+subject+", StudentCount :"+studentCount);
	}
}
