package Exam;

public class Person {
	int id;
	String name;
	public static int count = 0;
	public Person() { count++;}
	public Person(int id, String name) {
		this.id =id;
		this.name = name;
		count ++;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void whoAreYou() {
		System.out.println("Id : "+id+", Name : "+ name);
	}
	public void display() {
		System.out.println("Person Id : "+id+" Name : "+ name);
	}

}
