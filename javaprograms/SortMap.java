//Program 13

package com.javaprograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


public class SortMap 
{
	public static HashMap<String, Integer> sortByValue(HashMap<String, Integer> hm)
	{
		List<Integer> valueList = new ArrayList(hm.values());



		Collections.sort(valueList);   
		HashMap<String, Integer> newHM = new LinkedHashMap<String, Integer>();



		for(Integer i:valueList) 
		{
			for (Map.Entry<String,Integer> entry : hm.entrySet())

				if(entry.getValue() == i) 
				{
					newHM.put(entry.getKey(),entry.getValue());         
				}
		}
		
		return newHM;
	}


	public static void main(String[] args) 
	{
		HashMap<String, Integer> hm = new HashMap<String, Integer>();

		hm.put("Math", 98);
		hm.put("Data Structure", 85);
		hm.put("Database", 91);
		hm.put("Java", 95);
		hm.put("Operating System", 79);
		hm.put("Networking", 80);
		HashMap<String, Integer> hm1 = sortByValue(hm);

		for (Map.Entry<String, Integer> en : hm1.entrySet()) 
		{
			System.out.println("Key = " + en.getKey() +
					", Value = " + en.getValue());
		}
	}
}