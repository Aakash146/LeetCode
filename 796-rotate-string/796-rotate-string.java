class Solution {
    public boolean rotateString(String s, String goal) {
        for(int i = 0; i < s.length() ; i++){
            String first = s.substring(0,i);
            String second = s.substring(i);
            String full = second + first;
            if(full.equals(goal)){
                return true;
            }
        }
        return false;
    }
}