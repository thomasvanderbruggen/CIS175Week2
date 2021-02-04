package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Student;

public class testStudentLogic {
	Student student = new Student("Joe"); 
	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void testGenerateLetterGrade() {
		student.setPercentGrade(83); 
		assertTrue('B' == student.generateLetterGrade());  
	}

}
