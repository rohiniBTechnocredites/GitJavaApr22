package loopAssingments;

class Employee{
	
	String empName = "TechnoCredits";
	String empDeptId = "IT-Tech-101";
	int empid = 215;

	public static void main(String[] args){
		Employee emp = new Employee();
		System.out.println(emp.empName);
		emp.printData();
	}
	
	void printData(){
		System.out.println("Employee Name is :"+ empName);
		System.out.println("Employee Name is :"+ empDeptId);
		System.out.println("Employee Name is :"+ empid);
		
	}
}