package loopAssingments;

import java.util.*;
class Student{
	
	void checkGrade(int score, String name){
		if(score<0 || score>100)
			System.out.println ("Invalid Input for "+name);
		else if(score >=90 && score <=100)
			System.out.println (name+" has scored "+score+" with a grade as A+");
		else if(score >= 80 && score <90)
			System.out.println (name+" has scored "+score+" with a grade as A");
		else if(score >= 70 && score <80)
			System.out.println (name+" has scored "+score+" with a grade as B+");
		else if(score >= 60 && score <70)
			System.out.println (name+" has scored "+score+" with a grade as B");
		else if(score >= 50 && score <60)
			System.out.println (name+" has scored "+score+" with a grade as c");
		else if(score < 50)
			System.out.println (name+" is failed");
	}
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter name of the Student :");
		String name = sc.nextLine();
		
		System.out.println("Enter score of the Student :");
		int score = sc.nextInt();
		
		Student grade = new Student();
		
		grade.checkGrade(score,name);
		sc.close();
	
	}
}
