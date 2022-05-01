package Exam;

public class Test {
	 public static void main(String []args){

	        Person p1 = new Person(12345, "chPark");

	          Student s1 = new Student(20221, "abcd",1);

	          Teacher t1 = new Teacher(112233,"KIM","Java");

	          Student s2 = new Student();

	         

	          s2.setId(20222);

	          s2.setName("gildongHong");

	          s2.setGrade(2);

	          s2.attendClass(t1);

	         

	          System.out.println(Person.count);

	          System.out.println(Student.count);

	          System.out.println(Teacher.count);

	          System.out.println("\n-----------------\n");

	         

	          p1.whoAreYou();

	          s1.whoAreYou();

	          s2.whoAreYou();

	          t1.whoAreYou();

	          System.out.println("\n-----------------\n");

	   

	          p1.display();

	          s1.display();

	          t1.display();

	         

	          SchoolManager sm = SchoolManager.getInstance();
	          System.out.println("\n-----School Member-----\n");

	          sm.addMember(s1);

	          sm.addMember(s2);

	          sm.addMember(t1);

	         

	          sm.displayMemberAll();

	       

	     }

}
