package classesOneToTen;
import java.util.Random;

class ClassFour {

	//create a standart array of a given length
	static int [] naturals(int x) {
		int [] array = new int[x];
		return array;
	}
	
	//calculate the sum of all positions in an array
	static int sumOfArray(int [] x) {
		int sum = 0;
		for(int i = 0; i <= x.length -1 ; i++) {
			sum = sum + x[i];
		}
		return sum;
	}
	
	//create a set of number in an array with randow numbers
	static int [] randomArray(int x) {
		int [] randArray = new int[x];
		Random random = new Random();
		for(int i = 0; i <= x - 1; i++) {
			randArray[i] = random.nextInt(9);
		}
		return randArray;
	}
	
	//Calculate the avg of positions in an array
	static int avgArray(int[] x) {
		return sumOfArray(x) / x.length;
	}
	
	//copy an array using only a given set of positions
	static int [] copyArrayOfNValue (int x, int [] y) {
		int[] newArray = new int[x];
		for(int i = 0; i < newArray.length; i++) {
			newArray[i] = y[i];
		}
		return newArray;
	}
	
	//Copy an array using other vector length as base
	static int[] copyArrayUsingOtherArray(int[] y){
		return copyArrayOfNValue(y.length, y);
	}
	
	//Verify a given n number in an array 
	static boolean verifyNumber(int x, int[] y){
		for(int i = 0; i < y.length; i++){
			if(y[i] == x){
				return true;
			}
		}
		return false;
	}
	
	//Verify a number of occurrences in a given vector
	static int verifyOccurencys(int x, int[] y){
		int count = 0;
		for(int i = 0; i < y.length; i++) {
			if(y[i] == x) {
				count++;
			}
		}
		return count;
	}
	
	//Verify the max number of a vector
	static int maxNumber(int[] x) {
		int max = 0;
		for(int i = 0; i < x.length; i++){
			if(x[i] > max) {
				max = x[i];
			}
		}
		return max;
	}
	
	//copy an array from x, y positions
	static int[] copyArrayFromTo(int x, int y, int[] z) {
		int[] newArray = new int[y-x];
		int aux = 0;
		for(int i = x; i < y; i++) {
			newArray[aux] = z[i];
			aux++;
		}		
		return newArray;
	}
	
	//Get the 1st half of an array, if the positions are odd the should include the middle one (change the code to address the only arrayValue)
	static  int[] firstHalfOfArray(int[] x, boolean y) {
		int arrayValue = x.length / 2;
		if(x.length%2 != 0 && y){
			arrayValue += 1 ;
		}
		int[] newArray = new int[arrayValue];
		
		if(x.length%2 != 0 && y == true){
			for(int i = 0; i < (x.length / 2) + 1; i++) {
				newArray[i] = x[i];
			}
		}
		else {
			for(int i = 0; i < x.length / 2; i++){
				newArray[i] = x[i];
			}
		}
		return newArray;
	}
	
	//Get the 2nd half of the vector (ask teacher about vector length)
	static int[] secondHalfOfArray(int[] x, boolean y) {
		int arrayValue = 0;
		if(x.length%2 != 0 && y == true){
			arrayValue = (x.length / 2) + 1 ;
		}
		if(x.length%2 != 0 && y == false){
			arrayValue = x.length / 2;
		}
		if(x.length%2 == 0) {
			arrayValue = x.length / 2;
		}
		int[] newArray = new int[(x.length /2) +1];  //how to add only the specific number, set a var inside an if clause
		int aux = 0; //how to not add an aux
		if(x.length%2 != 0 && y == true){
			aux = (x.length / 2) + 1;
			for(int i = x.length-1; i > (x.length / 2) + 1; i--) {
				newArray[aux] = x[i];
				aux--;
			}
		}
		else {
			aux = (x.length / 2);
			for(int i = x.length -1; i > x.length / 2; i--){
				newArray[aux] = x[i];
				aux--;
			}
		}
		return newArray;
	}
	
	//Union two arrays
	static int[] unionArray(int[] x, int[] y) {
		int[] newArray = new int[x.length + y.length];
		int aux = x.length;
		for(int i = 0; i < x.length ; i++) {
			newArray[i] = x[i];
		}
		for(int i = 0; i < y.length; i++) {
			newArray[aux] = y[i];
			aux++;
		}
		return newArray;
	}
	
	//Create inverted array from the original (ask about starting point)
	static int[] inverseArray(int[] x) {
		int[] newArray = new int[x.length];
		int aux = 0;
		for(int i = x.length - 1; i >= 0; i--) {
			newArray[aux] = x[i];
			aux++;
		}
		return newArray;
	}
	
	//Create an array using random numbers for both length and positions
	static int[] randomArrayAndPosition(int x) {
		int[] newArray = new int[(int) (Math.random() * x)];
		for(int i = 0; i < newArray.length; i++) {
			newArray[i] = (int)(Math.random() * x);
		}
		return newArray;
	}
	
	//New array, double size and duplicate entry
	static int[] duplicateArray(int[] x) {
		int[] newArray = new int[x.length*2];
		int aux = 0;
		for(int i = 0; i < x.length; i++) {
			newArray[aux] = x[i];
			newArray[aux+1] = x[i];
			aux = aux + 2;
		}
		return newArray;
	}

	//New array copy fist half and invert second half
	static int[] copyHalfInvertHalf(int[] x) {
		int[] newArray = new int[x.length];
		int aux = x.length / 2;
		for(int i = 0; i < x.length / 2; i++) {
			newArray[i] = x[i];
		}
		for(int i = x.length - 1; i >= x.length / 2; i--) {
			newArray[aux] = x[i];
			aux++;
		}
		return newArray;
	}

	//Copy an array witouth the middle element(assuming odd positions) (ask best option)
	static int[] copyWithoutMiddleElement(int[] x) {
		int[] newArray = new int[x.length];
		for(int i = 0; i < x.length; i++) {
			if(x[i] == x[x.length / 2]){
			}
			else{
			newArray[i] = x[i];
			}
		}
		return newArray;
	}
	
	//New vector with fibonacci sequence
	static int[] fibonachiSequence(int x) {
		int firstAlg = 0, secondAlg = 1, totalAlg;
		int[] newArray = new int[x + 1];
		newArray[0] = firstAlg;
		newArray[1] = secondAlg;
		for(int i = 2; i <= x; i++) {
			totalAlg = firstAlg + secondAlg;
			firstAlg = secondAlg;
			secondAlg = totalAlg;
			newArray[i] = totalAlg;
		}
		return newArray;
	}
}