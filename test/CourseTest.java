import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.Course;
import model.Student;

class CourseTest {

private Course course;
	
	private void setupScenary1() {
		course = new Course();
	}
	
	private void setupScenary2() {
		setupScenary1();
		course.addStudent(001, "Juanita");
		course.addStudent(002, "Paula");
		course.addStudent(003, "Jose");
		course.addStudent(004, "Liliana");
		course.addStudent(005, "Pedro");
	}
	
	@Test 
	public void addStudentTest() {
		setupScenary1();
		course.addStudent(111, "Marisol");
		Student s = course.searchStudent(111);
		assertNotNull("The student was added to the BST with successfull", s);
		assertTrue("There not exist a Student with the request code", 111 == s.getCode());
		
		setupScenary2();
		course.addStudent(222, "Carolina");
		s = course.searchStudent(222);
		assertNotNull("The student was added to the BST with successfull", s);
		assertTrue("There not exist a Student with the request code", 222 == s.getCode());
	}
	
	@Test
	public void searchTest() {
		setupScenary1();
		Student found = course.searchStudent(333);
		assertNull("There are not Students with the Request Code", found);
		
		setupScenary2();
		found = course.searchStudent(006);
		assertNotNull("The Student is in the BST, so the search was sucessful", found);
		assertTrue("There not exist a Student with the request code", 006 == found.getCode());
		
		found = course.searchStudent(444);
		assertNull("There are not Students with the Request Code", found);
	}
	



}
