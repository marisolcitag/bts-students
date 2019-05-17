package model;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import junit.framework.TestCase;
import model.Course;
import model.Student;

class CourseTest extends TestCase{

	private Course course;
	
	private ArrayList<Student> trail;
	
	private void setupStage1() {
		setupStage1Preorder();
		
		course = new Course();
		course.setRoot(trail.get(0));
		course.getRoot().setLeft(trail.get(1));
		course.getRoot().setLeft(trail.get(2));
		course.getRoot().setRight(trail.get(3));
		course.getRoot().setRight(trail.get(4));
		course.getRoot().setRight(trail.get(5));
		course.getRoot().setLeft(trail.get(6));
		course.getRoot().setLeft(trail.get(7));
		course.getRoot().setRight(trail.get(8));
	}
	
	private void setupStage1Preorder(){
		trail = new ArrayList<Student>();
		trail.add(new Student(5678, "A"));
		trail.add(new Student(5542, "Cinco"));
		trail.add(new Student(5308, "DonJuan"));
		trail.add(new Student(5318, "RIB"));
		trail.add(new Student(5882, "Emilio"));
		trail.add(new Student(6789, "Juanito"));
		trail.add(new Student(6488, "Argemiro"));
		trail.add(new Student(5912, "Oli"));
		trail.add(new Student(8890, "Mulato"));
	}
}
