package javabean;

public class Student {
	private int rollNo;
	private String name;
	private String course;
	private long phNo;
	private String emailId;
	private char division;
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public long getPhNo() {
		return phNo;
	}
	public void setPhNo(long phNo) {
		this.phNo = phNo;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public char getDivision() {
		return division;
	}
	public void setDivision(char division) {
		this.division = division;
	}
	public Student(int rollNo, String name, String course, long phNo, String emailId, char division) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.course = course;
		this.phNo = phNo;
		this.emailId = emailId;
		this.division = division;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", course=" + course + ", phNo=" + phNo + ", emailId="
				+ emailId + ", division=" + division + "]";
	}
	
	
	
	

}