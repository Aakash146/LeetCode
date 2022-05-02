class Solution {
    public int[] intersection(int[] num1, int[] num2) {
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < num1.length; i++){
         if(!set.contains(num1[i])){
             set.add(num1[i]);
         }
        }
        for(int i = 0; i < num2.length; i++){
         if(set.contains(num2[i])){
             list.add(num2[i]);
             set.remove(num2[i]);
         }
            if( set.size()== 0) break;
        }
        return list.stream().mapToInt(i->i).toArray();
    }
}