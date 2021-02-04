package model;
import java.util.ArrayList; 

public class Gradebook {
	private ArrayList<Student> students; 
	public Gradebook() {
		students = new ArrayList<Student>(); 
	}
	public Gradebook(ArrayList<Student> students) {
		this.students = students; 
	}
	public Student getValedictorian() { 
		double topScore = students.get(0).getPercentGrade(); 
		Student topStudent = students.get(0); 
		for (Student student: students) {
			if (topScore < student.getPercentGrade()) {
				topScore = student.getPercentGrade(); 
				topStudent = student; 
			}
		}
		return topStudent;
	}
	public boolean needsHelp(Student student) {
		if (student.getPercentGrade() < 70) {
			return true;
		}else {
			return false;
		}
	}
	public ArrayList<Student> getStudents() {
		return students;
	}
	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}
}
