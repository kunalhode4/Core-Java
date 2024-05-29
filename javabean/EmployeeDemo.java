package javabean;

public class EmployeeDemo {
 private int adharNo;
 private String name;
 private int empAge;
public int getAdharNo() {
	return adharNo;
}
public void setAdharNo(int adharNo) {
	this.adharNo = adharNo;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getEmpAge() {
	return empAge;
}
public void setEmpAge(int empAge) {
	this.empAge = empAge;
}

// constructor
public EmployeeDemo(String empName,int empAge,int adharNo) {
	
	this.adharNo = adharNo;
	this.empAge = empAge;
	this.name = empName;
}
 











}