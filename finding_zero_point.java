/*
* Problem Statement
* Given an sorted integer array, find the indices of the greatest negative element
* and the smallest positive element.
*
* Follow up: what if the array is unsorted?
*/



class Problem{

	public static void main(String args[]){

	}

	public int[] static findIndicesSorted(int[] nums){
		int[] res = new int[2]; //array to store two indices
		int start = 0;
		int end = nums.length - 1;

		//Start iterates through array from beginning, and End 
		//iterate through array from the end. Keep increasing
		//start until start's next element is >= 0, keep 
		//decreasing End until End's next element is <= 0
		while(nums[start + 1] < 0 || nums[end - 1] > 0){
			if(nums[start + 1] < 0) start++;
			if(nums[ebd - 1] > 0) end--;
		}
		res[0] = start;
		res[1] = end;
		return res;
	}


	//Solution of follow-up problem
	public int[] static findIndicesUnsorted(int[] nums){
		int[] res = new int[2];
		int maxNegative = Integer.MIN_VALUE;
		int minPositive = Integer.MAX_VALUE;
		int negative = -1;
		int positive = -1;
		for(int i = 0; i < nums.length; i++){
			if(nums[i] < 0 && nums[i] > maxNegative){
				negative = i;
				maxNegative = nums[i];
			}
			if(nums[i] > 0 && nums[i] < minPositive){
				positive = i;
				minPositive = nums[i];
			}
		}
		res[0] = negative;
		res[1] = positive;
		return res;
	}
}

