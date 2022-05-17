class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = height.length-1, max = 0;
        while(left < right) {
            if(height[left] <= height[right]) {
                max = Math.max(max, (right-left) * height[left++]);
            } else {
                max = Math.max(max, (right-left) * height[right--]);
            }
        }
        return max;
    }
}