class Solution {
    public String customSortString(String order, String s) {
        HashMap<Integer, Character> position = new HashMap<>();
        HashMap<Character, Integer> values = new HashMap<>();
        int i =0 , j= 0;
        StringBuilder sb = new StringBuilder();
        while(i < order.length()){
            position.put(i, order.charAt(i));
            i++;
        }
        while(j < s.length()){
            if(position.containsValue(s.charAt(j))) values.put(s.charAt(j), values.getOrDefault(s.charAt(j), 0) + 1);
                else sb.append(s.charAt(j));
            j++;
        } 
        j = 0;
        while(j < order.length()){
            if(sb.length() == s.length()) break;
            for(i = 0 ; i < values.get(position.get(j)); i++){
                sb.append(position.get(j));
            }
            j++;
        }
        return sb.toString();
    }
}