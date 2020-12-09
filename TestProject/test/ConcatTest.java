package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ConcatTest {

	@Test
	public void testConcatenate() {
		Junit test=new Junit();
		String result=test.Concatenate("Saravanan","Renuka");
		assertEquals("SaravananRenuka",result);
		//fail("Not yet implemented");
		
	}

}
