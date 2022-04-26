class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> ans = new HashMap();
        for(String s : strs){
            char [] arr = s.toCharArray();
            Arrays.sort(arr);
            String str = String.valueOf(arr);
            List<String> list = ans.getOrDefault(str, new ArrayList()); 
            list.add(s);
            ans.put(str, list);
        }
        List<List<String>> anagram = new ArrayList<>(ans.values());
        return anagram; 
//         List<List<String>> anagram = new ArrayList<>();
//         for(int j = 0 ;j < strs.length ; j++){
//             if(strs[j] == null){
//                 continue;
//             }
//             String s = strs[j];
//             ArrayList<String> list = new ArrayList<>();
//             list.add(s);
//             strs[j] = null;
//             for(int i =j+1 ; i < strs.length; i++){
//                 if(strs[i] == null){
//                     continue;
//                 }   
//                 String str = strs[i];
//                 char[] a = s.toCharArray();
//                 char[] b = str.toCharArray();
//                 Arrays.sort(a);
//                 Arrays.sort(b);
//                 if(Arrays.equals(a,b)){
//                     list.add(str);
//                     strs[i] = null;
                    
//                 }
//             }
//             anagram.add(list);
//         }
//         return anagram;       
    }
}