package com.stringBuilder;

public class userNameToEmail{
	public static void main(String[] args) {
		StringBuilder email = new StringBuilder("ajmerabhavik7862@gamil.com");
		StringBuilder userName = new StringBuilder("");
		
		for(int i = 0; i < email.length(); i++) {
			if(email.charAt(i) == '@') {
				break;
			}else {
				userName = userName.insert(i, email.charAt(i));
			}
		}
		System.out.println(userName);
	}
}