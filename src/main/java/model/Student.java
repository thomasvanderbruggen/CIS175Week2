package model;

public class Student {
	private String name; 
	private double percentGrade; 
	
	public Student() {
		name = new String(); 
	}
	
	public Student(String name) {
		this.name = name; 
	}
	public Student(String name, double percentGrade) {
		this.name = name; 
		this.percentGrade = percentGrade; 
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPercentGrade() {
		return percentGrade;
	}

	public void setPercentGrade(double percentGrade) {
		this.percentGrade = percentGrade;
	}

	public char generateLetterGrade() {
		if (percentGrade >= 90) {
			return 'A'; 
		}else if (percentGrade >= 80) {
			return 'B'; 
		}else if (percentGrade >= 70) {
			return 'C'; 
		}else if (percentGrade >= 60) {
			return 'D'; 
		}else {
			return 'F'; 
		}
	}
	public boolean eligibleForScholarship() {
		if (percentGrade >= 90) {
			return true; 
		}else {
			return false; 
		}
	}
	
}
