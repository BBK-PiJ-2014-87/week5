package recursionTest;

public class DemoSum {
	public static void main(String[] args) {
		
		System.out.println("Iterative version of sum");
		System.out.println("sum of numbers 10 to 1: " + sumIter(217));
		System.out.println("Recursive version of sum");
		System.out.println("sum of numbers 10 to 1: " + sumRec(217));
	}
		
	
	private static int sumIter(int limit){
		int sum = 0;
		while(limit>0){
			sum = sum+limit;
			limit--;
		}
		return sum;
	}
	
	private static int sumRec(int limit){
		if(limit>0){
			int sum = limit+sumRec(limit-1);
			return sum;
		}else{
			return 0;
		}
		
	}


}

