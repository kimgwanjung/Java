package Exam;

public class Student extends Person {
	int grade;
	int subjectCount = 0;
	public static int count = 0;
	public Student() {count++;}
	public Student(int id, String name, int grade) {
		super(id,name);
		this.grade = grade;
		count++;
	}
	public void attendClass(Teacher t) {
		this.subjectCount++;
		t.attendClass(this);
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public void display() {
		System.out.println("Student Id : "+id+", Name : "+ name+", Grade : "+grade+", SubjectCount : "+subjectCount);
	}
	

}
