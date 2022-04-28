class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double windowSum = 0;
        for(int i = 0 ; i < k ; i++){
            windowSum += nums[i];
        }
        double maxSum = windowSum;
        for(int i = k ; i < nums.length ; i++){
            windowSum -= nums[i-k];
            windowSum += nums[i];
            maxSum = Math.max(maxSum, windowSum);
        }
        return maxSum/k;
        // double sum = Integer.MIN_VALUE;
        // for(int i = 0; i <= nums.length-k; i++){
        //     double avg = 0;
        //     for(int j = i; j< i+k; j++){
        //         avg += nums[j];
        //     }
        //     if(avg/k > sum){
        //         sum = avg/k;
        //     }
        // }
        // return sum;
    }
}