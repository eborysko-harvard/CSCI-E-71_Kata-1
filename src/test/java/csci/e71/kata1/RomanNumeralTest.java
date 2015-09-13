/**
 * 
 */
package csci.e71.kata1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author jsanford
 *
 */
public class RomanNumeralTest {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link csci.e71.kata1.RomanNumeral#RomanNumeral(java.lang.String)}.
	 */
	@Test
	public void testRomanNumeralString() {
		RomanNumeral rn = new RomanNumeral("I"); 
		assertEquals(rn.toInt(), 1);
		
		rn = new RomanNumeral("V"); 
		assertEquals(rn.toInt(), 5);
		
		rn = new RomanNumeral("X"); 
		assertEquals(rn.toInt(), 10);
		
		rn = new RomanNumeral("L"); 
		assertEquals(rn.toInt(), 50);
		
		rn = new RomanNumeral("C"); 
		assertEquals(rn.toInt(), 100);
		
		rn = new RomanNumeral("D"); 
		assertEquals(rn.toInt(), 500);
		
		rn = new RomanNumeral("M"); 
		assertEquals(rn.toInt(), 1000);
		
		rn = new RomanNumeral("Q"); 
		assertEquals(rn.toInt(), 0);
	}

	/**
	 * Test method for {@link csci.e71.kata1.RomanNumeral#RomanNumeral(java.lang.String)}.
	 */
	@Test
	public void testMultipleRomanNumeralString() {
		
		RomanNumeral rn = new RomanNumeral("II"); 
		assertEquals(rn.toInt(), 2);
		
		rn = new RomanNumeral("III"); 
		assertEquals(rn.toInt(), 3);
		
		rn = new RomanNumeral("VI"); 
		assertEquals(rn.toInt(), 6);
		
		rn = new RomanNumeral("XV"); 
		assertEquals(rn.toInt(), 15);
		
		rn = new RomanNumeral("MCLX"); 
		assertEquals(rn.toInt(), 1160);
		
		
	}
	
	/**
	 * Test method for {@link csci.e71.kata1.RomanNumeral#RomanNumeral(java.lang.String)}.
	 */
	@Test
	public void testSubtractMultipleRomanNumeralString() {
		
		RomanNumeral rn = new RomanNumeral("IV"); 
		assertEquals(rn.toInt(), 4);
		
		rn = new RomanNumeral("IX"); 
		assertEquals(rn.toInt(), 9);
		
		rn = new RomanNumeral("XL"); 
		assertEquals(rn.toInt(), 40);
		
		rn = new RomanNumeral("XC"); 
		assertEquals(rn.toInt(), 90);
		
		rn = new RomanNumeral("LM"); 
		assertEquals(rn.toInt(), 950);
		
		
	}

	
	/**
	 * Test method for {@link csci.e71.kata1.RomanNumeral#RomanNumeral(java.lang.String)}.
	 */
	@Test
	public void testAddSubtractMultipleRomanNumeralString() {
		
		RomanNumeral rn = new RomanNumeral("XLI"); 
		assertEquals(rn.toInt(), 41);
		
		rn = new RomanNumeral("XLIV"); 
		assertEquals(rn.toInt(), 44);
		
		rn = new RomanNumeral("XCV"); 
		assertEquals(rn.toInt(), 95);
	
	}	
		
	/**
	 * Test method for {@link csci.e71.kata1.RomanNumeral#RomanNumeral(java.lang.String)}.
	 */
	@Test
	public void testRejectRomanNumeralString() {
		
		RomanNumeral rn = new RomanNumeral("XLIA"); 
		assertEquals(rn.toInt(), 0);
		
		rn = new RomanNumeral("XLIVJ"); 
		assertEquals(rn.toInt(), 0);
		
		rn = new RomanNumeral("AXCV"); 
		assertEquals(rn.toInt(), 0);
	
	}
	
	/**
	 * Test method for {@link csci.e71.kata1.RomanNumeral#RomanNumeral(java.lang.String)}.
	 */
	@Test
	public void testConvertChar() {
		assertEquals(RomanNumeral.convertChar('I'), 1);
		assertEquals(RomanNumeral.convertChar('V'), 5);
		assertEquals(RomanNumeral.convertChar('X'), 10);
		assertEquals(RomanNumeral.convertChar('L'), 50);
		assertEquals(RomanNumeral.convertChar('C'), 100);
		assertEquals(RomanNumeral.convertChar('D'), 500);
		assertEquals(RomanNumeral.convertChar('M'), 1000);
		assertEquals(RomanNumeral.convertChar('J'), 0);
	}
}
