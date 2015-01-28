package recursionTest;

class Factorial {
	int num = 0;

	public int getFactorial(int n) {
		if (n == 1) {
			return 1;
		} else {
			num = n * getFactorial(n - 1);
			return num;
		}
	}

}

public class App {
	public static void main(String[] args) {
		Factorial fact1 = new Factorial();
		
		System.out.println(fact1.getFactorial(5));
	}
}
