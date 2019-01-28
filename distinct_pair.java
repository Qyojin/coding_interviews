/*
* Problem statement
* You are given a list of integers and a number k. You want to find all distinct pair (a, b) consist of 
* numbers from the list that add up to k. Two pairs are considered distinct if they are different after
* sorting. E.g (1, 9) and (9, 1) are not considered distinct. (4, 2) and (4, 6) are considered distinct. 
* For this problem, your solution should return a integer denoting how many distinct pairs can be formed.
*/



class Solution{

	public static void main(String[] args){

	}


	public static int distinctPairs(list<Integer> a, long k){
		Collections.sort(a);
		int start = 0;
		int end = a.size() - 1;
		int counter = 0;
		while(start < end){
			long sum = a.get(start) + a.get(end);
			if(sum == k){
				count ++;
				start++;
				end--;

				//skip indistinct pairs
				while(start < end && a.get(start) == a.get(start - 1)) start++;
				while(start < end && a.get(end) == a.get(end + 1)) end--;
			}
			else if(sum < k){
				start++;
			}
			else{
				end--;
			}
		}
		return counter;
	}
}