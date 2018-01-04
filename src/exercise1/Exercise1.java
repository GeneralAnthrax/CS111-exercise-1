/*
 * Name:
 * Assignment: Exercise 1
 * Lab Instructor: Domenick Poster
 * Date:
 * 
 * Purpose: Review of fundamental programming concepts and
 * Java basics including functions, conditional statements,
 * equality, loops, arrays, and recursion.
 */

package exercise1;

import classes.Box;
import classes.Cat;
//import matryoshka.RussianThing;
//import matryoshka.RussianBox;
//import matryoshka.RussianCat;

public class Exercise1 {

	/*
	 * Problem 1
	 * 
	 * Create a public static function called 'add' which accepts two
	 * parameters: the first parameter is an integer, the second parameter is a
	 * double. Return the sum of the two numbers.
	 * 
	 * Example: add(1, 2.5) -> 3.5
	 * 
	 * -> symbol indicates return value
	 */

	// define Problem 1's function here

	public static double add(int x, double y) {
		return x + y;
	}

	/*
	 * Problem 2
	 * 
	 * Complete the 'snooze' function as follows: We snooze if it is not a
	 * weekday or we're on vacation. Return true if we snooze! The parameter
	 * 'weekday' is true if it is a weekday, and the parameter 'vacation' is
	 * true if we are on vacation.
	 * 
	 * Example: snooze(true, false) -> false
	 */

	public static boolean snooze(boolean weekday, boolean vacation) {
		if (weekday != true || vacation == true) {
			return true;
		}
		if (weekday == true && vacation == true) {
			return true;
		} 
		else {
			return false;
		}
	}

	/*
	 * Problem 3
	 * 
	 * Complete the function 'repeat' as follows: Given a string and a
	 * non-negative int n, return a larger string that is n copies of the
	 * original string.
	 * 
	 * Example: repeat("Hi", 2) -> "HiHi" repeat("Hi", 3) -> "HiHiHi"
	 */
	public static String repeat(String str, int n) {
		for (int i = 0; i < n; i++) {
			str = str + str;
		}
		return str;
	}

	/*
	 * Problem 4
	 * 
	 * Complete the function 'first' as follows: The parameter 'values' is an
	 * array of integers. Return the first number in the array. You can assume
	 * the array is not empty.
	 * 
	 * Example: int[] values = {1, 3, 3, 7}; first(values) -> 1
	 */

	public static int first(int[] values) {
		return values[0];
	}

	/*
	 * Problem 5
	 * 
	 * Complete the function 'last' as follows: The parameter 'values' is an
	 * array of integers. Return the last number in the array. You can assume
	 * the array is not empty. Example: int[] values = {1, 3, 3, 7};
	 * last(values) -> 7
	 */

	public static int last(int[] values) {
		return values[values.length - 1];
	}

	/*
	 * Problem 6
	 * 
	 * Complete the function 'range' as follows: Given the integer parameter n,
	 * create and return an array of integers such that the array contains the
	 * integers 0 up to, but not including, n. You can assume n will be a
	 * positive (> 0) integer.
	 * 
	 * Example: range(4) -> {0, 1, 2, 3}
	 */

	public static int[] range(int n) {
		int[] array = new int[n - 1];

		for (int i = 0; i < array.length; i++) {

		}
		return array;

	}

	/*
	 * Problem 7
	 * 
	 * Complete the function 'reduceProduct' as follows: Given a two dimensional
	 * array of integers, multiply all the integers together and return the
	 * final product.
	 * 
	 * Example: int[][] values = {{1, 2}, {10, 10}}; reduceProduct(values) ->
	 * 200
	 */

	public static int reduceProduct(int[][] values) {
		int product = 1;
		for (int i = 0; i < values.length; i++)
			for (int j = 0; j < values[i].length; j++)
				product *= values[i][j];
		return product;

	}

	/*
	 * Problem 8
	 * 
	 * Create a public class called 'Cat' in the Cat.java file.
	 * 
	 * See Cat.java for details
	 */

	/*
	 * Problem 9
	 * 
	 * Complete the function 'makeKitty' as follows: Create a cat (named
	 * whatever you want) and return it.
	 */

	public static Cat makeKitty() {
		Cat cat1 = new Cat("blackCat");
		return cat1;

	}

	/*
	 * Problem 10
	 * 
	 * Create a public class called 'Box' in the Box.java file
	 * 
	 * See Box.java for details
	 */

	/*
	 * Problem 11
	 * 
	 * Complete the function 'rescueKitty' as follows: Given a Box, return
	 * whatever is inside the Box, and empty the Box out (set its cat to Null).
	 */

	public static Cat rescueKitty(Box box) {
		Cat blackCat = new Cat("Midnight");
		Box box1 = new Box(blackCat);

		box1.setCat(null);
		return box1.getCat();
	}

	/*
	 * Problem 12 - Catception
	 * 
	 * Complete the function 'secretKittyName' as follows: Given a RussianThing,
	 * which could either be a RussianCat, or a RussianBox containing a
	 * RussianThing, return the name of the RussianCat hidden deep inside.
	 * 
	 * A RussianThing has three methods: 1) isBox() - returns true if it is a
	 * RussianBox, false otherwise 2) isCat() - returns true if it is a
	 * RussianCat, false otherwise 3) getContents() - If the RussianThing is a
	 * RussianBox, returns the RussianThing inside the box, but if the
	 * RussianThing is a RussianCat, returns null. A RussianThing has one public
	 * field: 1) name - The name of the cat or box.
	 * 
	 * For testing purposes: A RussianBox has two constructors, one which
	 * accepts a RussianCat as a parameter, and one which accepts a RussianBox
	 * as a parameter. A RussianCat has one constructor which accepts a String
	 * parameter for the name of the cat.
	 */

	public static String secretKittyName(RussianThing thing) {
		

	}

	/*
	 * New Problems: Strings, chars, objects, and equality
	 */

	/*
	 * Problem 13
	 * 
	 * Given two strings, return true if the two strings are "kinda equal." The
	 * strings are "kinda equal" if they contain the same characters in the same
	 * order regardless of upper/lower case letters.
	 * 
	 * Example: kindaEqual("Hi", "hi") -> true kindaEqual("hi!", "hi.") -> false
	 * 
	 * Note: The Java 8 API is a great resource for finding helpful methods. Use
	 * the API documentation for Strings to help with the following problem.
	 * 
	 * https://docs.oracle.com/javase/8/docs/api/java/lang/String.html
	 */
	public static boolean kindaEqual(String a, String b) {
		a.toLowerCase();
		b.toLowerCase();

		if (a.equals(b)) {
			return true;

		} else
			return false;
	}

	/*
	 * Problem 14
	 * 
	 * Given a string, cut the string in half and return a new string formed by
	 * reversing the two halves. If the string has an odd number of characters,
	 * the character in the middle should remain in the same position.
	 * 
	 * Example: reverseHalves("mad") -> "dam" reverseHalves("loop") -> "pool"
	 */
	public static String reverseHalves(String str) {
		int midIndex = str.length() / 2;
		String result;
		if (str.length() % 2 == 0) {

			String firstHalf = str.substring(0, midIndex);
			String secondHalf = str.substring(midIndex, str.length());
			result = secondHalf + firstHalf;
		} else {

			String firstHalf = str.substring(0, midIndex);
			String midString = Character.toString(str.charAt(midIndex));
			String secondHalf = str.substring(midIndex + 1, str.length());
			result = secondHalf + midString + firstHalf;
		}

		return result;

	}

	/*
	 * Problem 15
	 * 
	 * Given a string, return a new string such that every character in the
	 * original string has its case swapped.
	 * 
	 * Example: invertCase("This is a Test") -> "tHIS IS A tEST"
	 */
	public static String invertCase(String str) {
		
		for(int i = 0; i < str.length(); i++){
			str.toCharArray();
		}
		
		
		
	}

	/*
	 * Problem 16
	 * 
	 * Given an array of chars (characters) and two non-negative integers, swap
	 * the chars at the indices of the array indicated by the integers.
	 * "in-place." ("In-place" means return the same array with the chars
	 * swapped instead of creating a new array.)
	 * 
	 * You can assume you will be given valid input.
	 * 
	 * Example
	 * 
	 * char[] chars = {'y', 'o'}; swap(chars, 0, 1) -> {'o', 'y'}
	 */
	public static char[] swap(char[] chars, int i, int j){
		char temp [] = new char [chars.length];
		for(int a = 0; a < chars.length; a++){
			chars[i] = chars[j];
			temp[j] = chars[i];
			
			
		}
		return temp;
	}

	/*
	 * Problem 17
	 * 
	 * Given a non-negative integer n, compute the factorial of n (the product
	 * of all positive integers less than or equal to n) without using loops.
	 */
	public static int factorial(int n) {
		
		if (n == 0) {
			
			return 1;
			
		}

		return factorial(n - 1) ;

	}

}
