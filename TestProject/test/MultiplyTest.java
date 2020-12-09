package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MultiplyTest {

	@Test
	public void testMultiply() {
		Junit test=new Junit();
		int result=test.multiply(5,2);
		assertEquals(10,result);
		//fail("Not yet implemented");
		
	}

}
