package recursionTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class PaperSizeTest {

	@Test
	public void testsInputToSteps() {
		PaperSize p = new PaperSize();
		String input = "A00000";
		int output = p.convertInputToSteps(input);
		int expected = 4;
		assertEquals(output, expected);
		String input2 = "A0";
		int output2 = p.convertInputToSteps(input2);
		int expected2 = 0;
		assertEquals(output2, expected2);
		String input3 = "A1";
		int output3 = p.convertInputToSteps(input3);
		int expected3 = -1;
		assertEquals(output3, expected3);
	}

}
