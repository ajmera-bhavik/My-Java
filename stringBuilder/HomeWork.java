package com.stringBuilder;

public class HomeWork{
	public static void main(String[] args) {
		String str = "Hieie";
		StringBuilder result = new StringBuilder("");
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == 'i') {
				result.append('e');
			}else {
				result.append(str.charAt(i));
			}
		}
		System.out.println(result);
	}
}