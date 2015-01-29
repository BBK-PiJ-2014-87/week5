package recursionTest;

public class Power {
	public static void main(String[] args) {
		System.out.println(powLoop(2, 10));
		System.out.println(powRec(2, 10));
	}

	public static int powLoop(int base, int exp) {
		int result = base;
		if(exp==0){
			result = 1;
		}else{
			while (exp > 1) {
				result = result * base;
				exp--;
			}
		}		
		
		return result;
	}

	
	public static int powRec(int base, int exp) {
		if (exp > 0) {
			int result = base * powRec(base, exp - 1);
			return result;
		} else {
			return 1;
		}
	}

}
