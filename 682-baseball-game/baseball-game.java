class Solution {
    public int calPoints(String[] operations) {
        Stack <Integer> stack=new Stack<>();
       for(String op:operations)
        {
            if(op.equals("C"))//not op=="C" since it is a string
            {
                stack.pop();
            }
            else if(op.equals("D"))//doubling top element
            {
                stack.push(stack.peek()*2);
            }
            else if(op.equals("+"))//add new element which is the sum of the previous two elements
            {
               int first=stack.pop();//1st element pop cause we need to take second element
               int second=stack.peek();//2nd element is in the top
               stack.push(first);//the element popped is again pushed to the stack
               stack.push(first+second);// new element which is the sum is pushed
            }
            else
            {
                stack.push(Integer.parseInt(op));
            }
        }
        int sum=0;
        while(!stack.isEmpty())
        {
            sum+=stack.pop();

        }
        return sum;
    }
}