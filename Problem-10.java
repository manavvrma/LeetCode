// 125. Valid Palindrome

class Solution {
    public boolean isPalindrome(String s) {

        StringBuilder norm = new StringBuilder();

        for(char ch:s.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                norm.append(Character.toLowerCase(ch));
            }
        }

        int left = 0;
        int right = norm.length()-1;

        while(left<right){
            if(norm.charAt(left) != norm.charAt(right)){
                return false;
            }
            left++;
            right--;
        }

        return true;
        
    }
}
