package loopAssingments;

class Assingment5{

	// 1. Numbers divisiable by either 7 or 13
		void checkDivisiability(int start, int end){
			int cnt=0;
			
			for(int num=start; num<=end; num++){	
				if(num%7==0){
					System.out.println(num+" is divisiable by 7");
					cnt++;
				} else if (num%13==0){
					System.out.println(num+" is divisiable by 13");
					cnt++;
				}
				if(cnt==5)
					break;
			}
		}
		
	//2. Print reverse odd numbers

		void printReverseOddNo(int start, int end){
			int cnt=0;
			for(int num=end;num>start;num--){
				if(num%2!=0){
					System.out.println(num);
					cnt++;
				}
				
				if (cnt==3)
					break;
			}
		}
		
	//3. Print sum of numbers in defined range
		void sumOfGivenNo(int start, int end){
			int sum=0;
			
			for (int num=start; num<=end; num++)
				sum= sum +num;
				
				System.out.println("Sum of numbers in range :"+sum);
		}

	// 4. Count of numbers divisiable by either 7 or 13 in a range
		void checkCount(int start, int end){
			int cnt=0;
			
			for(int num=start; num<=end; num++){	
				if(num%7==0){
					cnt++;
				} else if (num%13==0){
					cnt++;
				}
			}
			
			System.out.println("Count of numbers divisiable by 7 or 13 are "+cnt);
		}
		
	//main method
		public static void main(String[] args){
			
			Assingment5 ass = new Assingment5();
			
			// 1. Numbers divisiable by either 7 or 13
			System.out.println("1. Numbers divisiable by either 7 or 13-------------------");
			ass.checkDivisiability(5,40);
			System.out.println();

			// 2. Print reverse odd numbers
			System.out.println("2. Print firts three reverse odd numbers");
			ass.printReverseOddNo(10,20);
			System.out.println();
			
			//3. Print sum of numbers in defined range
			System.out.println("3. Print sum of numbers in defined range");
			ass.sumOfGivenNo(1,5);
			System.out.println();
			
			// 4. Count of numbers divisiable by either 7 or 13 in a range
			System.out.println("4. Count of numbers divisiable by either 7 or 13 in a range");
			ass.checkCount(5,40);
		}
	}