/**
 * 
 */
package com.test.java;

/**
 * @author Dell
 *
 */
public class ReverseString {

	/**
	 * @param args
	 */
	String reverse = "";

	public String reverseString(String str) {

		if (str.length() == 1) {
			return str;
		} else {
			reverse += str.charAt(str.length() - 1) + reverseString(str.substring(0, str.length() - 1));
		}

		return reverse;

	}

	public static void main(String[] args) {
		
		ReverseString RS=new ReverseString();
		System.out.println("Result is :"+RS.reverseString("Selenium"));

	}

}
