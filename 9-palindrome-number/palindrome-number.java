class Solution {
    public boolean isPalindrome(int x) {
        
        String str = String.valueOf(x);
        String reversed = "";
        
        for(int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);
        }
        
        return str.equals(reversed);
    }
}