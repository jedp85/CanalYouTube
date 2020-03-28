package classesOneToTen;

public class ClassOne {

	//Given any number, give me the double of it
	static int doubleNumber(int x) {
		return x * 2;
	}
	
	//Difference between two numbers
	static int difference(int x, int y) {
		return x-y;
	}
	
	//Proportion between a number and it's total
	static double proportion(int x, int total) {
		return (double) x/total;
	}
	
	//Return the average 
	static double avg(int x, int y) {
		return (double) (x+y)/2;
	}
	
	//Round numbers
	static int round(double x) {
		return (int)x;
	}

	//Is negative
	static boolean isNegative(int x) {
		return x < 0;
	}
	
	//Is Odd
	static boolean isOdd(int x) {
		return x%2 != 0;
	}	
	
	//Is even
	static boolean isEven(int x) {
		return x%2 == 0;
	}
	
	//Check to see if two numbers are multiple
	static boolean isMultiple(int x, int y) {
		return x%y == 0;
	}
	
	//Check if its a digit
	static boolean isDigit(int x) {
		return x >= 0 && x < 10;
	}
	
	//Check if a number is in an interval 
	static boolean isInclueded(int x) {
		return x > 4 && x < 10;
	}
	
	//Using the method created before, the negation of it
	static boolean isNotIncluded(int x) {
		return !isInclueded(x);
	}
	
	//Calculate XOR function
	static boolean XOR(boolean x, boolean y) {
		return x&&y;
	}
	
	//Check if a vowel is lowercase
	static boolean isVowel(char x) {
		return x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u';
	}
}
