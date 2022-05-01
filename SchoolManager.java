package Exam;
import java.util.ArrayList;

public class SchoolManager {
	ArrayList<Person> memberList;
	private static SchoolManager instance = new SchoolManager();
	private SchoolManager() {
		memberList = new ArrayList<Person>();
	}
	public static SchoolManager getInstance() {return instance;}
	public void addMember(Person p) {
		memberList.add(p);
	}
	public void displayMemberAll() {
		for(Person p : memberList) {
			p.display();
		}
	}
}
