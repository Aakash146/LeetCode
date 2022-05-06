class MyQueue {
        Stack<Integer> stack;
        Stack<Integer> queue ;
    public MyQueue() {
        stack = new Stack<>();
        queue = new Stack<>();
    }
    
    public void push(int x) {
        stack.push(x);
    }
    
    public int pop() {
        while(stack.size() != 0){
            queue.push(stack.pop());
        }
        int value = queue.pop();
        while(queue.size() != 0){
            stack.push(queue.pop());
        }
        return value;
    }
    
    public int peek() {
        while(stack.size() != 0){
            queue.push(stack.pop());
        }
        int value = queue.peek();
        while(queue.size() != 0){
            stack.push(queue.pop());
        }
        return value;
    }
    
    public boolean empty() {
        if(stack.size() == 0) return true;
        else return false;  
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */