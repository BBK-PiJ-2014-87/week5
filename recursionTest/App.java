package recursionTest;

class Number {
	

	public int calculateFactorial(int n) {
		if (n == 1) {
			return 1;
		} else {
			int result = n * calculateFactorial(n - 1);
			return result;
		}
	}
	
	public int calculateFib(int n){
		if ((n==1) || (n==2)){
			return 1;
		}else{
			int result = calculateFib(n-1) + calculateFib(n-2);
			return result;
		}
	}
	

}

public class App {
	public static void main(String[] args) {
		Number fact1 = new Number();
		
		System.out.println(fact1.calculateFactorial(5));
		System.out.println(fact1.calculateFib(6));
	}
}
