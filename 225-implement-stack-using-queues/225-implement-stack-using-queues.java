class MyStack {
    Queue<Integer> stack ;
    Queue<Integer> queue ;
    public MyStack() {
        stack = new LinkedList<>();
        queue = new LinkedList<>();
    }
    
    public void push(int x) {
        queue.add(x);
    }
    
    public int pop() {
        int value = 0;
        while(queue.size() != 0){
            if(queue.size() == 1) value = queue.remove();
            else stack.add(queue.remove());
        }
        while(stack.size() != 0){
            queue.add(stack.remove());
        }
        return value;
    }
    
    public int top() {
        int value = 0;
        while(queue.size() != 0){
            if(queue.size() == 1){
                value = queue.peek();
            }
            stack.add(queue.remove());
        }
        while(stack.size() != 0){
            queue.add(stack.remove());
        }
        return value;
        
    }
    
    public boolean empty() {
        if(queue.size() == 0) return true;
        else return false;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */