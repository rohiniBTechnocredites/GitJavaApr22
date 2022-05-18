package loopAssingments;

public class CheckDivisibility {
	
	//1. Check divisibility by five---------
		void checkNumberDivisiableByFive(int startRange, int endRange){
			
			for	(int num=startRange; num<=endRange; num++){
				if(num%5==0)
					System.out.println(num +" is divisiable by 5");
			}
		}

	//2. Check divisibilty by three and five---------
		
		void checkNumberDivisiableByThreeFive(int startRange, int endRange){
			
			for	(int num=startRange; num<=endRange; num++){
				if(num%3==0 && num%5==0)
					System.out.println(num +" is divisiable by 3 and 5");
			}	
		}
		
	//3. Sum of given numbers---------

		void checkSum(int startRange, int endRange){
				int temp=0;
				
				for	(int num=startRange; num<=endRange; num++){
					 temp = temp + num;
				}
				System.out.println("Sum of numbers is "+temp);
		}
		
	//4. Differance between sum of even and odd numbers

		void sumOfEvenOdd(int startRange, int endRange){
				int evenNo=0; 
				int oddNo=0;
				int diff = 0;
		
				for	(int num=startRange; num<=endRange; num++){
					if(num%2==0)
						evenNo = evenNo + num;
					else
						oddNo = oddNo + num;
				}
				
				diff = oddNo - evenNo;
				System.out.println("Differance between sum of even and odd numbers :"+ diff);
		}
		
		// main()
		public static void main(String[] args){
		
		CheckDivisibility chk = new CheckDivisibility();
		
		
		//1. Check divisibility by five---------
		
		System.out.println("1. Check divisibility by five---------");
		chk.checkNumberDivisiableByFive(10,30);
		System.out.println();
		
		//2. Check divisibilty by three and five---------
		System.out.println("2. Check divisibility by three and five---------");
		chk.checkNumberDivisiableByThreeFive(5,18);
		System.out.println();
		
		//3. Sum of given numbers---------
		System.out.println("3. Sum of given numbers---------");
		chk.checkSum(1,15);
		System.out.println();
		
		//4. Differance between sum of even and odd numbers
		System.out.println("4. Differance between sum of even and odd numbers---------");
		chk.sumOfEvenOdd(3,9);
		}

}


