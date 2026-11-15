class StockSpanner {
    // stack store {price,span}
    Stack<int[]>stack;

    public StockSpanner() {
        // initial an empty stack
        stack = new Stack<>();
        
        
    }
    
    public int next(int price) {
        // every stock span is minimum 1 , so 
        // initially span is 1
        int span = 1;
        // Check whether the stack is not empty
        // and the previous stock price is smaller than
        // or equal to the current stock price
        while(!stack.isEmpty()  && stack.peek()[0] <= price){
        // Remove the previous stock price because
            // it is smaller than or equal to today's price
            // Add its already calculated span to our current span
            span += stack.pop()[1];
    }
             // Store the current stock price and its calculated span
        // in the stack as an integer array
        stack.push(new int[]{price, span});

        // Return the calculated span for today's stock price
        return span;
        
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */