import java.util.Stack;

class StockSpanner {
    private Stack<int[]> stack; // Stores pairs of [price, span]

    public StockSpanner() {
        stack = new Stack<>();
    }
    
    public int next(int price) {
        int span = 1; // Current day always counts
        
        // Pop elements while the top of the stack has a price <= current price
        while (!stack.isEmpty() && stack.peek()[0] <= price) {
            span += stack.pop()[1];
        }
        
        // Push the current price and its calculated span
        stack.push(new int[]{price, span});
        
        return span;
    }
}