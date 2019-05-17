package model;

import java.util.ArrayList;
import java.util.List;

public class Course {
	
	
	private Student root;
	
	public Course() {
		
	}
	
	public void addStudent( int c, String n) {
		Student newStudent = new Student(c, n);
		Student current = root;
		if(root==null) {
			root = newStudent;
		}else {
			addStudent(current, newStudent);
		}
	}
	
	public void addStudent(Student current, Student newStudent) {
		
			if(current.compareTo(newStudent)<= 0) {
				if(current.getLeft() == null) {
					current.setLeft(newStudent);
				}else {
					addStudent(current.getLeft(), newStudent);
				}
			}else if(current.compareTo(newStudent) > 0) {
				if(current.getRight() == null) {
					current.setRight(newStudent);
				}else {
					addStudent(current.getRight(), newStudent);
				}
			}
	}
	
	public Student searchStudent(int c) {
		Student toSearch = new Student(c,null);
		Student current = root;
		return search(current, toSearch);
	}

	public Student search(Student current, Student toSearch) {
		if(current.compareTo(toSearch) == 0) {
			return current;
		}else if(current.compareTo(toSearch) < 0){
			return (current.getLeft() == null)? null : search(current.getLeft(), toSearch);
		}else {
			return (current.getRight() == null)? null : search(current.getRight(), toSearch);			
		}
	}

	
	
	public Student getRoot() {
		return root;
	}

	public void setRoot(Student root) {
		this.root = root;
	}

	public List<Student> inorder() {
		ArrayList<Student> s = new ArrayList<Student>();
		if(root != null) {
			root.inorder(s);
		}
		return s;
	}
	
	public List<Student> preorder() {
		ArrayList<Student> s = new ArrayList<Student>();
		if(root != null) {
			root.preorder(s);
		}
		return s;
	}
	
	public List<Student> postorder() {
		ArrayList<Student> s = new ArrayList<Student>();
		if(root != null) {
			root.postorder(s);
		}
		return s;
	}

}
