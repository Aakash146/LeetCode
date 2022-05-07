class Solution {
    public int searchInsert(int[] nums, int target) {
        if(target <= nums[0]) return 0;
        if(target > nums[nums.length -1]) return nums.length;
        int start = 0;
        int end = nums.length-1;
        int mid = (start+end)/2;
        while(start != end){
            if(end-start == 1){
                return end;
            }
            if(nums[mid] == target){
                return mid;
            }
            if(target > nums[mid]){
                start = mid;
                mid = (start + end)/2;
            }
            else{
                end = mid;
                mid = ( start + end)/2;
            }
        }
        return mid;
    }
}