package JUnitTests;

import static org.junit.Assert.*;
//import static org.junit.Assert.*;
import org.junit.Test;

//import PGPpackage.PGPclass;
import PGPpackage.PGPs;

public class PGPtest {
		    
		@Test
		public void test() 
		{
			PGPs s;
			PGPs ss;
			// test 1		
			s = new PGPs("привет");
			ss = new PGPs("привет");
			assertEquals("error", s.Sum, ss.Sum); 

		}

	}
