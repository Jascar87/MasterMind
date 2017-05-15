import static org.junit.Assert.*;

import org.junit.Test;

public class ComputerTest {

	@Test
	public void testValidaTarget(){
		Computer computer = new Computer();
		assertTrue(Giudice.valida(computer.target));
	}

	@Test
	public void testValidaGuess(){
		Computer computer = new Computer();
		assertTrue(Giudice.valida(computer.genGuess()));
	}
}
