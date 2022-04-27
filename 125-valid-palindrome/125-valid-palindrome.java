class Solution {
    public boolean isPalindrome(String str) {
        StringBuilder s = new StringBuilder();
        for(int i = 0 ; i < str.length();i++){
            if(str.charAt(i)>='A' && str.charAt(i)<='Z' || str.charAt(i)>='a' && str.charAt(i)<='z' || str.charAt(i)>='0' && str.charAt(i)<='9'){
                s = s.append(str.charAt(i));
            }
        }
        String s1 = s.toString();
        s1 = s1.toLowerCase();
        for(int i = 0 ; i < s1.length()/2;i++){
            if(s1.charAt(i)!= s1.charAt(s1.length()-1-i)){
                return false;
            }
        }
        return true;
    }
}