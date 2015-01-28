package recursionTest;

class Factorial {
	

	public int calculateFactorial(int n) {
		if (n == 1) {
			return 1;
		} else {
			int result = n * calculateFactorial(n - 1);
			return result;
		}
	}

}

public class App {
	public static void main(String[] args) {
		Factorial fact1 = new Factorial();
		
		System.out.println(fact1.calculateFactorial(5));
	}
}
