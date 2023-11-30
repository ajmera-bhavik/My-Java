//Comapare String 
package com.StringInJava;

import java.util.*;

public class String_Equal{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		
//		if(str1.compareTo(str2) == 0) {
//			System.out.println("Here Appere Strings Are Equal");
//		}else{
//			System.out.println("Here Appere Strings Are Not Equal");
//		}
		
		
		
		if(str1.equals(str2)) {
			System.out.println("Here Appere Strings Are Equal");
		}else{
			System.out.println("Here Appere Strings Are Not Equal");		
		}
		
		
		//Note:  This == sign Valid for some Times.....
		if(str1 == str2) { 
			System.out.println("Here Appere Strings Are Equal");
		}else{
			System.out.println("Here Appere Strings Are Not Equal");		
		}
	}
}