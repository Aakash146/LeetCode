class Solution {
    public int[] intersection(int[] num1, int[] num2) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < num1.length; i++){
         if(!map.containsKey(num1[i])){
             map.put(num1[i],1);
         }
        }
        System.out.println(map);
        for(int i = 0; i < num2.length; i++){
         if(map.containsKey(num2[i])){
             list.add(num2[i]);
             map.remove(num2[i]);
         }
            if( map.size()== 0) break;
        }
        return list.stream().mapToInt(i->i).toArray();
    }
}