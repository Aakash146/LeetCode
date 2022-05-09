class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int changes = 0;
        for(int i = 0 ; i < grid.length ; i++){
            int temp = i;
            for(int j = 0;j < grid[0].length; j++){
                int value = grid[i][j];
                int hmax = 0;
                int vmax = 0;
                for(int k = j ; k < grid[0].length; k++){
                    if(hmax< grid[i][k]) hmax = grid[i][k];
                }
                for(int k = j - 1 ; k >= 0; k--){
                    if(hmax< grid[i][k]) hmax = grid[i][k];
                }
                for(int k = temp ; k < grid.length; k++){
                    if(vmax< grid[k][j]) vmax = grid[k][j];
                }
                for(int k = temp - 1 ; k >= 0; k--){
                    if(vmax< grid[k][j]) vmax = grid[k][j];
                }
                if(hmax < vmax) grid[i][j] = hmax;
                else grid[i][j] = vmax;
                
                changes += grid[i][j] - value;
            }   
        }
        return changes;
    }
}