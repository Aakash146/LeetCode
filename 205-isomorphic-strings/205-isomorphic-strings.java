class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> pairChars = new HashMap<Character,Character>();
        for(int i = 0 ; i < s.length(); i++){
            char _s = s.charAt(i);
            char _t = t.charAt(i);
            if(pairChars.containsKey(_s)){
                if(_t != pairChars.get(_s)) return false;
            }
            else {
                if(pairChars.containsValue(_t)) return false;
                pairChars.put(_s,_t);
            }
        }
        return true;
    }
}