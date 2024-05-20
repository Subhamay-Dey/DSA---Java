package LeetCode;

public class problem33 {
    class Solution {
        public String reverseVowels(String s) {
            
            char[] arr = s.toCharArray();
            int left = 0;
            int right = arr.length - 1;
    
            while(left < right) {
                if(isVowel(arr[left])) {
                    while(left < right && !isVowel(arr[right])) {
                        right--;
                    }
                    if(isVowel(arr[right])) {
                        swap(arr, left, right);
                        right--;
                    }
                }
                left++;
            }
    
            return new String(arr);
        }
    
        private boolean isVowel(char c) {
            return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
        }
    
        private void swap(char[] arr, int left, int right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
    
        
        }
    }
}
