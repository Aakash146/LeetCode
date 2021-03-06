class MinStack {
    ArrayList<Integer> list;
    public MinStack() {
        list = new ArrayList<>();
    }
    
    public void push(int val) {
        list.add(0,val);
    }
    
    public void pop() {
        list.remove(0);
    }
    
    public int top() {
        int value = list.get(0);
        return value;
    }
    
    public int getMin() {
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < list.size(); i++){
            if(min > list.get(i)){
                min = list.get(i);
            }
        }
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */