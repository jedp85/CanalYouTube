package classesOneToTen;

class ClassSix {
	//create array of array, req matrix
	static int[][] randomMatrix(int row, int col){
		int[][] newArray = new int[row][col];
		for(int i = 0; i < newArray.length; i++){
			for(int e = 0; e < newArray[i].length; e++){
				newArray[i][e] = 1 + (int)(Math.random() * 9);
			}
		}
		return newArray;
	}
	
	//create a square matrix
	static int[][] sqrMatrix(int n){
		return randomMatrix(n,n);
	}
	
	//Given a matrix sum up all chars
	static int sumOfMatrix(int m){
		int sum = 0;
		int[][] newArray = randomMatrix(m, m);
		for(int i = 0; i < newArray.length; i++){
			for(int e = 0; e < newArray[i].length;e++){
				sum += newArray[i][e];
			}
		}
		return sum;
	}
	
	//Count number of elements
	static int evalMatrixCount(int[][] m){
		int count = 0;
		for(int i = 0; i < m.length; i++){
			count += m[i].length;
			}
		return count;
	}
	
	//Create full random matrix for both col, rows and positions
	static int[][] randomMatrixTotalRandom(int x){
		int m = (int)(Math.random() * 9);
		int n = (int)(1 + Math.random() * 5);
		int[][] newArray = new int[n][m];
		for(int i = 0; i < newArray.length; i++){
			for(int e = 0; e < newArray[i].length;e++){
				newArray[i][e] = 1 + (int)(Math.random() * 9);
			}
		}
		return newArray;
	}
	
	static int[] unrollMatrix(int[][] v) {
		int[] newArray = new int[evalMatrixCount(v)];
		for(int i = 0; i < v.length ; i++){
			for(int e = 0; e < v[i].length; e++){
				newArray[e] = v[i][e];
			}
		}
		return newArray;
	}
	
	static void test(int x){
		int[][] newArray = randomMatrix(3,3);
		unrollMatrix(newArray);
	}
}