package javabean;

public class StudentImp {

	public static void main(String[] args) {
		Student std = new Student();
		
		//Setter
		std.setRollNo(737);
		std.setName("Shweta");
		std.setCourse("BSC.IT");
		std.setDivision('A');
		std.setPhNo(58461275);
		std.setEmailId("Shweta20gupta@gmail.com");
        //Getter
		System.out.println("Rollno is " +std.getRollNo());
		System.out.println("Name is " +std.getName());
		System.out.println("Corse Name is" +std.getCourse());
		System.out.println("Divvision is" +std.getDivision());
		System.out.println("Phone No is" +std.getPhNo());
		System.out.println("Email ID is " +std.getEmailId());
		

	}

}
