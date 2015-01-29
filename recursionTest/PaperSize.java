package recursionTest;

import java.util.Scanner;

public class PaperSize {
	public static void main(String[] args) {
		PaperSize p = new PaperSize();		
		p.run();
		
	}

	public void run() {
		getSize(convertInputToSteps(getInput()));
	}

	private String getInput() {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter paper size: ");
		String input = in.nextLine();
		return input;
	}

	private int convertInputToSteps(String word) {
		int steps = 0;
		if (word.charAt(1) == '0') {
			word = word.substring(1, word.length());
			// System.out.println(word);
			steps = word.length();
			// System.out.println(steps);
			return steps;

		} else {
			steps = Integer.parseInt(word.substring(1));
			// System.out.println(steps);
			return -steps;

		}
	}

	private String makeSmaller(int height, int width, int steps) {
		if (steps < 0) {
			return makeSmaller(width / 2, height, steps + 1);			
		} else {			
			return "height " + height +" width "+width;			
		}
	}

	private void getSize(int steps) {
		int width = 1189;
		int height = 841;
		if (steps < 0) {
			System.out.println(makeSmaller(height, width,steps));
		} else if (steps > 1) {
			System.out.println("none");
		} else {
			System.out.println("none");
		}
	}

}
