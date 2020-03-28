package classesOneToTen;

class ClassThree {
	//Counts all divisors of a number
	static int numberOfDivisorOf(int n) { 
		int numberofdivisiors = 0;
		int i = 1;
		while( i <= n ) {
			if(n % i == 0) {
				numberofdivisiors += 1;
			}
			i += 1;
		}
		return numberofdivisiors;
	}

	//Sums up all divisors
	static int sumOfDivisorsOf(int n) { 
		int sumofdivisors = 0;
		int i = 1;
		while( i < n) {
			if(n % i == 0) {
				sumofdivisors = sumofdivisors + i;
			}
			i = i + 1;
		}
		return sumofdivisors;
	}

	//Check for prime number
	static boolean isPrime(int n) { 
		return numberOfDivisorOf(n) == 2;
		}

	//Sums up all primes
	static int sumOfPrime(int n) { 
		int i = n;
		int sumOfPrime = 0;
		while(i != 0) {
			if(isPrime(i) == true) {
				sumOfPrime = sumOfPrime + i;
			}
		i--;
		}
		return sumOfPrime;
	}

	//Counts the number of primes
	static int allPrimeUntil(int n) { 
		int count = 0;
		while(n != 0) {
			if(isPrime(n) == true) {
				count = count +1;
			}
			n--;
		}
		return count;
	}

	//Checks for perfect number
	static boolean isPerfect(int n) {
		return sumOfDivisorsOf(n) == n;
	}
	
	//Gives the number of perfect numbers given a stop point
	static int [] numberOfPerfectNumbers(int n) {
		int [] result = new int[9];
		for(int i = 1; i <= n; i++) {
			if(isPerfect(i)){
				result[i] = i;
			}
		}
		return result;
	}
	
	//Show all primes within a given interval
	static int [] existPrime(int x, int y) {
		int [] result = new int[(y-1)-x];
		int aux = 0;
		for(int i = x + 1; i < y; i++) {
			if(isPrime(i)) {
				result[aux] = i;
				aux += 1;
			}
		}
		return result;
	}
	
	//Shows the bigger difference between primes in a given set
	static int biggerDifference(int x) {
		int aux1 = 0, aux2 = 0, result = 0;
		for(int i = 0; i < x; i++) {
			if(isPrime(i)) {
				aux1 = i;
				if(aux1 - aux2 > result) {
					result = aux1 - aux2;
				}
				aux2 = i;
			}
		}
		return result;
	}

}