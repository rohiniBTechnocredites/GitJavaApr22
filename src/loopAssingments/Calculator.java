package loopAssingments;

public class Calculator {
			
		public static void main(String[] args){
			Calculator cal = new Calculator();
			cal.add(10,10);
			cal.sub(15,17);
			cal.mul(4,5);
			cal.div(100,5);
		}
		
		void add(int a, int b){
			System.out.println("Sum is :"+(a+b));
		}
		
		void sub(int a, int b){
			System.out.println("Subtraction is :"+(a-b));
		}
		
		void mul(int a, int b){
			System.out.println("Multiplication is :"+(a*b));
		}
		
		void div(int a, int b){
			System.out.println("Division is :"+(a/b));
		}
}

