package org.wc2442.interview.questions;

public class ReverseString {

	public static String reverse(String word) {
		if(word == null || word.isEmpty()) {
			return word;
		}
		
		char[] chars = new char[word.length()];
		for(int i = 0; i <= word.length() / 2; i++) {
			chars[word.length() - i - 1] = word.charAt(i);
			chars[i] = word.charAt(word.length() - i - 1);
		}
		
		return new String(chars);
	}
}
