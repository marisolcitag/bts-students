package model;

import java.util.ArrayList;

public class Student implements Comparable<Student>{
	private int code;
	private String name;
	private Student left;
	private Student right;
	
	public Student(int code, String name) {
		this.code = code;
		this.name = name;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student getLeft() {
		return left;
	}

	public void setLeft(Student left) {
		this.left = left;
	}

	public Student getRight() {
		return right;
	}

	public void setRight(Student right) {
		this.right = right;
	}

	@Override
	public int compareTo(Student st) {
		int value = 1;
		if(this.code == st.code) {
			value = 0;
		}else if(this.code < st.code) {
			value = -1;
		}
		return value;
	}
	
	public void inorder(ArrayList<Student> s) {
		if(left != null) {
			left.inorder(s);
		}
		s.add(this);
		if(right != null) {
			right.inorder(s);
		}
	}
	
	public void preorder(ArrayList<Student> s) {
		s.add(this);
		if(left != null) {
			left.preorder(s);
		}
		if(right != null) {
			right.preorder(s);
		}
	}
	
	public void postorder(ArrayList<Student> s) {
		if(left != null) {
			left.postorder(s);
		}
		if(right != null) {
			right.postorder(s);
		}
		s.add(this);
	}
}
