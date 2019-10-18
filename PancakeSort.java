public class PancakeSort {
	
	//1. Write a function flip(arr, k) that reverses the order of the first k elements in the array arr
	
	//2. Write a function pancakeSort(arr) that sorts and returns the input array. You are allowed to use
	//   only the function flip you wrote in the first step in order to make changes in the array
	
	//Examples:
	// input: arr = [1, 5, 4, 3, 2]
	// output: [1, 2, 3, 4, 5] to clarify this is pancakeSort
	
	//Analyze the time and space complexion of your solution
	//Note: it's called pancake sort because it resembles sorting pancakes on a plate with a spatula,
	//where you can only use the spatula to flip some of the top pancakes in the plate. 
	
	static void flip(int [] arr, int k) {
		if(arr == null || arr.length < 2) {
			//if it's one no need to sort it
			return;
		}
		
		for(int i = 0; i < k/2; i++) {
			int temp = arr[i];
			System.out.println("temp: " + temp);
			arr[i]=arr[k-i-1];
			System.out.println("arr[i]: " + arr[i]);
			arr[k-i-1]= temp;
			System.out.println("arr[k-i-1]: " + arr[k-i-1]);
		}
		
		// [1 5 4 3 2] -> [1 2 3 4 5]
		// [4 2 3 1 5] -> [1 3 2 4 5] -> [3 1 2 4 5] -> [2 1 3 4 5]
		
		//iterate
		//
		//two flips per position swap
		
	}
	
	
	static int [] pancakeSort (int [] arr) {
		
		if(arr == null || arr.length < 2) {
			return arr;
		}
		
		for (int i = arr.length-1; i>=0; i--) {
			
			int maxElementIndex = i;
			
			//find the next greatest element
			for(int j = i; j >=0; j--) {
				if(arr[j] > arr[maxElementIndex]) {
					maxElementIndex = j;
				}
			}
			
			flip(arr, maxElementIndex + 1);
			flip(arr, i+1);
		}
		 
		for (int k = 0; k < arr.length; k++) {
			System.out.println("My Array: " + arr[k]);
		}
		
		
		return arr;
	}

	public static void main(String[] args) {
		
		int []  myArray = {1, 4, 5, 3, 2};
		
		int [] myArray2 = {1, 5, 4, 3, 2};
		
		pancakeSort(myArray);
		pancakeSort(myArray2);
		
		

	}

}
