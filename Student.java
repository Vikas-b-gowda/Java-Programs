package com.acharya.classes;

public class Student {

	int Studentid;
	String FirstName;
	String LastName;
	double Fee;

	public Student(int id, String FirstName, String LastName, double Fee) {
		this.Studentid = id;
		this.FirstName = FirstName;
		this.LastName = LastName;
		this.Fee = Fee;

	}

	public void getStudentID() {
		System.out.println("Student ID = " + Studentid);
	}

	public void getName() {
		System.out.println("Name = " + FirstName + " " + LastName);
	}

	public void getFee() {
		System.out.println("The Fee = " + Fee);
		System.out.println();

	}

	public static void main(String[] args) {
		Student st = new Student(123, "Vikas", "D B", 10000.0);
		Student st1 = new Student(124, "Prajwal", "D M", 100000.0);
		Student st2 = new Student(125, "Jeevan", "Shreeram", 490000.0);
		Student st3 = new Student(126, "Mayur", " H S", 1000000.0);
		st.getStudentID();
		st.getName();
		st.getFee();
		st1.getStudentID();
		st1.getName();
		st1.getFee();
		st2.getStudentID();
		st2.getName();
		st2.getFee();
		st3.getStudentID();
		st3.getName();
		st3.getFee();

	}

}
