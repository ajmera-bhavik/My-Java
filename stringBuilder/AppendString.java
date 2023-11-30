package com.stringBuilder;

public class AppendString{
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("B");
		sb.append('h'); // When we declare String And Add The element like this str = str + 'h';...
		sb.append('a'); // str = str + 'a';.. so on.....
		sb.append('v');
		sb.append('i');
		sb.append('k');
		System.out.println(sb);
	}
}