package UnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import Methods.ArthematicOperation;

public class ArthematicOperationTest {

	@Test
	public void testAdd() {
		int x = 5;
		int y = 6;
		ArthematicOperation operation = new ArthematicOperation();
		int actualOutput = operation.add(x, y);
		int expected = 11;
		assertEquals(expected, actualOutput);
		
	}
	

}
