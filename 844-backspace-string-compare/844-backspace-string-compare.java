class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder one = new StringBuilder();
        StringBuilder two = new StringBuilder();
        for(int i = 0; i< s.length(); i++){
            if(s.charAt(i) == '#') {
                 if (one.length() != 0 ) one.deleteCharAt(one.length()-1);
            }
            else one.append(s.charAt(i));
        }
        for(int i = 0; i< t.length(); i++){
            if(t.charAt(i) == '#'){
                if(two.length() != 0) two.deleteCharAt(two.length()-1);
            }
            else two.append(t.charAt(i));
        }
        return one.toString().equals(two.toString());
    }   
}