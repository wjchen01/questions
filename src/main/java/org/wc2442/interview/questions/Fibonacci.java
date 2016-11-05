package org.wc2442.interview.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Fibonacci {
	private static Map<Integer, Integer> valueCache = new HashMap<Integer, Integer>();
	
	public static List<Integer> sequence(int n) {
		if(n < 0) {
			throw new IllegalArgumentException("n must greater 0");
		}
		
		if(n == 0) {
			return new ArrayList<Integer>();
		}
		
		if(n == 1) {
			return Arrays.asList(0);
		}
		
		if(n == 2) {
			return Arrays.asList(0, 1);
		}
		
		final List<Integer> seq = new ArrayList<Integer>(n);
		seq.add(0);
		n--;
		seq.add(1);
		n--;
		while(n > 0) {
			int idx = seq.size();
			seq.add(seq.get(idx -1) + seq.get(idx - 2));
			n--;
		}
		return seq;
	}
	
	public static Integer value(int n) {
		if(n < 0) {
			throw new IllegalArgumentException("n must greater 0");			
		}
		else if(n < 2) {
			valueCache.put(n, n);
			return n;
		}
		else {
			if(valueCache.containsKey(n)) {
				return valueCache.get(n);
			}
			else {
				Integer number = value(n - 1) + value(n - 2);
				valueCache.put(n, number);
				return number;
			}
		}
	}
}
