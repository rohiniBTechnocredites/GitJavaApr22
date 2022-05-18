package loopAssingments;

import java.util.*;

class CheckNumbers{

	void checkDivisibility(int startRange, int endRange){
		int sum = 0;
		int cnt = 0;
		
		for(int i=startRange;i<=endRange;i++){
			if(i%3==0 && i%5==0){
				System.out.println("Number divisiable by 3 and 5 is:"+i);
				sum = sum+i;
				cnt++;
			}	
		}
		System.out.println("Sum of numbers divisiable by 3 and 5 is "+sum);
		System.out.println("Total numbers divisiable by 3 and 5 are "+cnt);
	}
	
	void checkDivisibilityByFive(int startRange, int endRange){
		int sum = 0;
		int cnt = 0;
		
		for(int i=startRange;i<=endRange;i++){
			if(i%5==0){
				System.out.println("Number divisisble by 5 is:"+i);
				sum = sum+i;
				cnt++;
			}	
		}
		System.out.println("Sum of numbers divisiable by 5 is "+sum);
		System.out.println("Total numbers divisiable by 5 are "+cnt);
	}
	
	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter start range:");
		int startRange = sc.nextInt();
		
		System.out.println("Enter end range:");
		int endRange = sc.nextInt();
		
		if(startRange>endRange){
			System.out.println("Invalid Range: Start range should be always lower than end range");
		} else {
			
			CheckNumbers num = new CheckNumbers();
			
		
			System.out.println("**********Check divisiability by Three and Five**********");
			num.checkDivisibility(startRange, endRange);
			
			System.out.println("**********Check divisiability by Five**********");
			num.checkDivisibilityByFive(startRange, endRange);
			sc.close();
		}
	
	}
}