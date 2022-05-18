package loopAssingments;

public class StudentDetails {
	
	String name = "Maulik";
	int rno = 1; 

	public static void main(String[] args){
		System.out.println("Hi");
		StudentDetails std = new StudentDetails();
		std.displayInfo();
		System.out.println("Hello");
	}
	
	void displayInfo(){
			System.out.println("  Name of Student: "+name);
			System.out.println("  Roll no of Student :"+rno);
		}
}
