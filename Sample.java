import java.util.Stack;

// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
class MyQueue {
    public Stack<Integer> s1;
    public Stack<Integer> s2;
    int front;
    public MyQueue() {
       s1 = new Stack<Integer>();
       s2 = new Stack<Integer>();
      front = 0;
    }
  // using two stacks to push elements to the queue. Since a stack adds elemnts to the top of queue we push 
  //  elements of stack 1 to stack 2 one by one and add the elment to the stack 2 and then pop elemnt from stack 2 and push it to stack 1 so that the added elemnt is at the back of the queue
    public void push(int x) {
        if(s1.empty()){
           front = x;
        }
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        s2.push(x);
        while(!s2.empty()){
            s1.push(s2.pop());
        }
        
    }
    
    public int pop() {
        int ele = s1.pop();
        if(!s1.empty())
            front = s1.peek();
       return ele;
    }
    
    public int peek() {
       return front;
    }
    
    public boolean empty() {
        return s1.isEmpty();
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