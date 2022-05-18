package loopAssingments;

public class Assingment6 {
	
	//while loop practice 

		void numberSum(){
			int sum=0;
			int cnt=0;
			
			while(sum<=100){
				cnt++;
				sum=sum+cnt;
			}
			
			System.out.println("Numbers required for 100 sum are "+cnt);
		}
		
		void divisiability(int startRange, int endRange){
			
			int cnt=1;

				for(int num=startRange;(cnt<=3 && num<=endRange);num++){ 
						if(num%13==0){
							System.out.println(num+ " is divisiable by 13");
							cnt++;
						}
						if(num%17==0){
							System.out.println(num+ " is divisiable by 17");
							cnt++;
						}
				}
		}
		
		void divisiability1(int startRange, int endRange){
			while(startRange<=endRange){
				
				if(startRange%5==0 && startRange%7==0){
					System.out.println(startRange+ " is divisiable by 5");
				}
				startRange++;
			}
		}
		
		public static void main(String[] args){
		
			Assingment6 ass = new Assingment6();
			
			ass.numberSum();
			ass.divisiability(5,40);
			ass.divisiability1(5,100);
		
		}
	}
