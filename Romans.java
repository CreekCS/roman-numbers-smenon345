//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Siddharth Menon

import java.util.*;

public class Romans
{
	private Map<String, Integer> m;
	
	public Romans()
	{
		m = new TreeMap<String, Integer>();

		m.put("I", 1);
		m.put("V", 5);
		m.put("X", 10);
		m.put("L", 50);
		m.put("C", 100);
		m.put("D", 500);
		m.put("M", 1000);
		
		//complete your map				
	}
	
	public int getNumber( String s )
	{
		int value = 0;
		if (m.containsKey(s)) {
			value = m.get(s);
		}

		return value;
		//complete this method
	}

}
