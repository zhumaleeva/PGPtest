package JUnitTests;

import static org.junit.Assert.assertEquals;

//import static org.junit.Assert.*;
import org.junit.Test;

//import PGPpackage.PGPclass;
import PGPpackage.PGPs;

public class PGPTest {	
	    
	@Test
	public void test() 
	{
		PGPs s;
		PGPs ss;
		// test 1		
		s = new PGPs("Привет");
		ss = new PGPs("Привет2");
		//String ss = ("4aa");
		
		//equals(s.Sum);
		assertEquals("error", s.Sum, ss.Sum);			    
	}
}
