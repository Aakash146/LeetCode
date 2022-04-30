class Solution {
    public int countOdds(int low, int high) {
        if(low%2 != 0 && high %2 != 0) return (high + 1 - low + 1)/2;
        else return (high-low + 1)/2;
    }
}