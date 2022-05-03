class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1){
            return s;
        }
        int len = 0;
        int movement = 0;
        StringBuilder[] arr= new StringBuilder[numRows];
        // String[] arr = new String[numRows];
        for(int j = 0; j < arr.length ; j++){
            arr[j] = new StringBuilder("");
        }
        int i = 0;
        while(i < s.length()){
            if(movement == 0){
                if(len == numRows){
                    movement = 1;
                    len -= 2;
                }
                else{
                    // arr[len] = arr[len] + s.charAt(i);
                    arr[len].append(s.charAt(i));
                    len++;
                    i++;
                }
            }
            else {
                if(len == -1 ){
                    movement = 0;
                    len += 2;
                }
                else{
                    // arr[len] = arr[len] + s.charAt(i);
                    arr[len].append(s.charAt(i));
                    len--;
                    i++;   
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for(StringBuilder str: arr){
            sb.append(str);
        }
        return sb.toString();
    }
}