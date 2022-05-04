class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
        // if(nums.length == 1){
        //     return nums[0];
        // }
        // HashMap<Integer,Integer> map = new HashMap<>();
        // for(int i = 0; i < nums.length ; i++){
        //     if(!map.containsKey(nums[i])){
        //         map.put(nums[i],1);
        //     }
        //     else{
        //         map.put(nums[i], map.get(nums[i]) + 1);
        //         if(map.get(nums[i])> nums.length/2){
        //             return nums[i];
        //         }
        //     }
        // }
        // return 0;
    }
}