/**
 * 
 */
package csci.e71.kata1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author jsanford
 *
 */
public class RomanNumeral implements Comparable{
	private int theNumber;
	
	public RomanNumeral(String s) {
		super();
		
		if (validateString(s)) {
			theNumber = convertString(s);
		}
		else {
			theNumber = 0;
		}
		
	}
	
	public int toInt() {
		return theNumber;
	}
	
	private static boolean validateString(String s) {
		Pattern p = Pattern.compile("[IVXLCDM]*");
		Matcher m = p.matcher(s);
		boolean b = m.matches();
		return b;
	}
	
	private static int convertString(String s) {
		char ar[] = s.toCharArray();
		int t = 0;
		int cur = 0;
		for (int i = 0; i < ar.length; i++) {
			cur = convertChar(ar[i]);
			if (i < (ar.length - 1) && cur < convertChar(ar[i+1])) {
				t -= cur;
			}
			else
				t += cur;
		}
		
		return t;
	}
	
	static int convertChar(char c) {
		switch (c) {
			case 'I':
				return 1;
			case 'V':
				return 5;
			case 'X':
				return 10;
			case 'L':
				return 50;
			case 'C':
				return 100;
			case 'D':
				return 500;
			case 'M':
				return 1000;
			default:
				return 0;
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + theNumber;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RomanNumeral other = (RomanNumeral) obj;
		if (theNumber != other.theNumber)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return Integer.toString(theNumber);
	}

	public int compareTo(Object o) {
		return ((RomanNumeral) o).toInt() - this.toInt();
	}
	
	
}
