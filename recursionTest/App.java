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
	
	/** Stack overflow test */
	
	public void toInfinity(int n){
		int n2 = n+1;
		System.out.println(n2);
		toInfinity(n2);
		
	}
	
	
	

}

public class App {
	public static void main(String[] args) {
		Number fact1 = new Number();
		
		System.out.println(fact1.calculateFactorial(5));
		System.out.println(fact1.calculateFib(6));
		
		//fact1.toInfinity(1);
	}
}
