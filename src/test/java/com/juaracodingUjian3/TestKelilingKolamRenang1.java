package com.juaracodingUjian3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class TestKelilingKolamRenang1 {
	
	kolamRenang kolamrenang1;

	@Before
	public void setUp() throws Exception {
		kolamrenang1 = new kolamRenang();
		
	}

	@Test
	@FileParameters("src/test/resources/kelilingkolamrenang.csv")
	public void testkelilingKolamRenang(double p, double l, double t, expect) {
		
		double actual = kolamrenang1.keliling(p, l, t);
		
		assertEquals(t, actual);
			
	}
	
	@Test
	public void testKelilingKolamRenangBukanAngka() {
		
		String doublebukanAngka = "C";
		double convert = Double.parseDouble(doublebukanAngka);
		
		double actual = kolamrenang1.keliling(convert);		
		
		String expect = "C";
		
		assertEquals(Double.parseDouble(expect), actual, 0.0);
		
	}
	
	@Test
	public void TestKelilingKolamRenangAngkaNegatif() {
		
		double p = -5.5;
		
		double actual = kolamrenang1.keliling(p);
		
		assertEquals(82, actual, 0.0);
			
	}
	
	@Test
	public void testKelilingKolamRenang1AngkaNull() {
		
		double p = 0;
		Double sisiNull = null;
				
		double actual = kolamrenang1.keliling(p);		
		
		assertNull(p);
		assertEquals(0, actual, 0.0);
	}

}