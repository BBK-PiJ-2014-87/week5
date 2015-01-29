package recursionTest;

public class HowBigIsMyStack {
	public static void main(String[] args) {
		stackString("abba",0);

	}

	private static void stackString(String word, int counter) {
		counter++;
		System.out.println(counter);
		stackString(word+"abba", counter);
		
		//System.out.println(word);
	}

}
