class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();

        StringBuilder result = new StringBuilder();
     
        for( int i = 0; i < s.length(); i++) {
            if((s.charAt(i) >= 97 && s.charAt(i) <= 122) || (s.charAt(i) >= 48 && s.charAt(i) <= 57)) {
                result.append(s.charAt(i));
            }
        }
        for(int j = 0; j < result.length()/2; j++) {
            if(result.charAt(j) != result.charAt(result.length() - 1 - j)) {
                return false;
            }
           
        }
         return true;
    }
}