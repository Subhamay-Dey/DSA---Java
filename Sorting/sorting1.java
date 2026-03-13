package Sorting;

import java.util.Comparator;

public class sorting1 {

	public static void sortBy(int[] arr, Comparator<Integer> fn) {
		// Implement sorting logic here
        for(int j = arr.length - 1; j > 0; j--) {
            for(int i = 0; i < j; i++) {
                if(fn.compare(arr[i], arr[i+1]) > 0) {
                    int num = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = num;
                }
            }
        }
	}

	public static void main(String[] args) {
		// Example usage
		int[] arr = {5, 2, 8, 1};
		sortBy(arr, Integer::compare);
        System.out.println(java.util.Arrays.toString(arr));
		// Print sorted array (if implemented)
	}
}

//{2,5,1,8}
//{2,1,5,8}
//{1,2,5,8}

