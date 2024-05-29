package javabean;

public class EmployeeDetail {

	public static void main(String[] args) {
		EmployeeDemo e1 = new EmployeeDemo("Kunal",22,239181139);
		System.out.println("Name - " + e1.getName());
		System.out.println("Age - " + e1.getEmpAge());
		System.out.println("Adhar No - " + e1.getAdharNo());	
	}
}