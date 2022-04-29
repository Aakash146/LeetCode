class Solution {
    public String findLongestWord(String s, List<String> dictionary) {
        String max = "";
        for(int i = 0; i < dictionary.size(); i++){
            int k = 0;
            for(int j = 0 ; j < s.length(); j++){
                if(s.charAt(j) == dictionary.get(i).charAt(k)) k++;
                if(k == dictionary.get(i).length()){
                    if(max.length() < dictionary.get(i).length()) max = dictionary.get(i);   
                    else if( max.length() == dictionary.get(i).length() ){
                        for(int l = 0; l < max.length(); l++){
                            if(max.charAt(l) > dictionary.get(i).charAt(l)){
                                max = dictionary.get(i);   
                                break;
                            }
                            else if(max.charAt(l) < dictionary.get(i).charAt(l)) break;
                            
                        }
                    }
                    break;
                }
            }
        }
        return max;
    }
}