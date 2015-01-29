package recursionTest;

public class Fibonacci {
	private int pos;

	public Fibonacci(int pos) {
		this.pos = pos;
	}

	public void solveRecursevly() {
		System.out.println(calculateRecursevly(pos));
	}

	public void solveLoop() {
		System.out.println(calculateLoop(pos));
	}

	private int calculateRecursevly(int number) {
		if (number > 2) {
			int result = calculateRecursevly(number - 1)
					+ calculateRecursevly(number - 2);
//			System.out.println(result);
			return result;
		} else {
			return 1;
		}
	}

	private int calculateLoop(int iter) {
		int result = 1;
		int nextNumber = 1;
		int prevNumber = 1;
		while (iter > 2) {
			result = prevNumber + nextNumber;
			iter--;
			prevNumber = nextNumber;
			nextNumber = result;
			
		}
		return result;
	}

	public static void main(String[] args) {
		Fibonacci fib = new Fibonacci(9);
		fib.solveRecursevly();
		fib.solveLoop();

	}

}
