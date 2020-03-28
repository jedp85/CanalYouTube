 package classesOneToTen;

class ClassTwo {
	//Gets Max between two numbers
	static int getMax(int x, int y) {
		if(x > y) {
			return x;
		}
		return y;
	}
	
	//Check multiple not using %
	static boolean isMultipleFor(int x, int y) {
		for(int k = 0; k < x; k++) {
			if(y*k == x) {
				return true;
			}
		}
		return false;
	}

	//Get absolute number
	static int getAbsolute(int x) {
		if(x > 0) {
			return x;
		}
		return -x;
	}
	
	//Get the coeficent of a division not using the division it self
	static int coeficent(int x, int y) {
		int result = 0;
		for(int i = 0; i <= y ; i++) {
			if(x < 0) {
				}
			else {
				x = x - y;
				result = i;
			}
		}
		return result;
	}
	
	//returns calcule of n^p
	static int elevatedToN(int n, int p) { 
		int sum = 1;
		for (int i = 1; i <= p; i++) {
			sum = sum * n;
		}
		return sum;
	}
	
	//Sums x number times
	static int sumOfNaturalsUpToN(int x) { 
		int l = 0;
		for (int i = 1; i <= x; i++) {
			l = l + i;
		}
		return l;
	}
	
	//sums all pair numbers between an interval
	static int sumOfEvenNumbersBetween(int x) { 
		int sum = 0;
		for(int i = 2; i <= x; i=i+2) {
			sum = sum + i;
		}
		return sum;
	}

	//finds the first number in a sequence
	static int firstNumberIn(int x) { 
		int result = 0;
		while(x > 0) {
			x = x / 10;
			result = x;
			if(result < 10) {
				break;
			}
		}
		return x;
	}
	
	//Returns fibonachi sequence given a number
	static int fibonachiNumber(int x) { 
		int first = 0, second = 1, sum;
		for(int i = 0; i <= x; i++) {
			sum = first + second;
			first = second;
			second = sum;
		}
		return first;
	}
	
	//Euclidian algorithm minimum commum multiple
	static int euclidianAlgorith(int n, int m) {
		int result = 0;
		for(int i = 1; i < n; i++) {
			if(n % i == 0) {
				result = i;
				for(int e = 1; e < m; e++) {
					if(m % e == 0) {
						if(e == i) {
							result = e;
						}
						else {
							result = 0;
						}
					}
				}
			}
		}
		return result;
	}
}