class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length, m= matrix[0].length;
        int[][] temp = new int[n][m];
        for(int i = 0 ; i < n ;i++ ){
            for(int j = 0 ; j < m ; j++){
                temp[i][j] = matrix[i][j];
            }
        }
        for(int i = 0 ; i < n ;i++ ){
            for(int j = 0 ; j < m ; j++){
                if(temp[i][j] == 0){
                    for(int x = i ; x < n ; x++){
                        matrix[x][j] = 0;
                    }
                    for(int x = i -1 ; x >= 0 ; x--){
                        matrix[x][j] = 0;
                    }
                    for(int x = j ; x < m ; x++){
                        matrix[i][x] = 0;
                    }
                    for(int x = j ; x >= 0 ; x--){
                        matrix[i][x] = 0;
                    }
                }
            }
        }
    }
}