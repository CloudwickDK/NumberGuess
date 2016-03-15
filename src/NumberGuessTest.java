import static org.junit.Assert.*;

import org.junit.Test;

public class NumberGuessTest {

	@Test
	public void test_parseAnswer_yes() {
		int min = 2;
		int max = 20;
		assertEquals(1, Number_Guess_Game.parseAnswer("yes"));
	}

	@Test
	public void test_parseAnswer_no() {
		int min = 2;
		int max = 20;
		assertEquals(-1, Number_Guess_Game.parseAnswer("no"));
	}
	
	@Test
	public void test_parseAnswer_other() {
		int min = 2;
		int max = 20;
		assertEquals(0, Number_Guess_Game.parseAnswer("other"));
	}
	
	@Test
	public void test_mean() {
		assertEquals(3, Number_Guess_Game.mean(2,4));
	}
}
