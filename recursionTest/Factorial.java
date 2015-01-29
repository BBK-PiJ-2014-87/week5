package recursionTest;

public class Factorial {
	private int fact;

	public Factorial(int fact) {
		this.fact = fact;
	}

	public void solveRecursevly() {
		System.out.println(calculateRecursevly(fact));
	}

	public void solveLoop() {
		System.out.println(calculateLoop(fact));
	}

	private int calculateRecursevly(int number){
		if (number==1){
			return 1;			
		}else{
			int result = number * calculateRecursevly(number-1);
			return result;
		}
	}
	
	private int calculateLoop(int number){
		int result = number;
		while(number>1){
			result = result*(number-1);
			number--;
		}
		return result;
	}
	
	
	

	public static void main(String[] args) {
		Factorial fact = new Factorial(5);
		fact.solveRecursevly();
		fact.solveLoop();

	}

}
