package tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import model.Gradebook;
import model.Student;

public class testGradebookLogic {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGetValedictorian() {
		Student tempStudent = new Student("Joe", 78); 
		ArrayList<Student> students = new ArrayList<Student>(); 
		students.add(tempStudent); 
		tempStudent = new Student("Tom", 85); 
		students.add(tempStudent); 
		tempStudent = new Student("Rachel", 93); 
		students.add(tempStudent); 
		tempStudent = new Student("Bo",65); 
		students.add(tempStudent); 
		
		Gradebook gb = new Gradebook(students); 
		assertEquals("Rachel", gb.getValedictorian().getName());
		
	}
	@Test
	public void testNeedsHelp() {
		Student testStudent = new Student("Don", 60); 
		Gradebook gb = new Gradebook(); 
		assertEquals(gb.needsHelp(testStudent), true); 
		
	}
	@Test
	public void testGradebookConstructor() {
		Student tempStudent = new Student("Tom"); 
		Student tempStudent2 = new Student("Adam"); 
		ArrayList<Student> students = new ArrayList<Student>(); 
		students.add(tempStudent2); 
		students.add(tempStudent); 
		Gradebook gb = new Gradebook(students); 
		assertNotNull(gb.getStudents()); 
	}

}
