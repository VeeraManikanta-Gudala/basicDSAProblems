import java.util.Stack;

public class LongestValidParenthsis {
    public static void main(String[] args) {
        String a="(()";
        /*
             * 
            Given a string containing just the characters '(' and ')', 
            return the length of the longest valid (well-formed) parenthesesubstring
            .

            

            Example 1:

            Input: s = "(()"
            Output: 2
            Explanation: The longest valid parentheses substring is "()".
            Example 2:

            Input: s = ")()())"
            Output: 4
            Explanation: The longest valid parentheses substring is "()()".
            Example 3:

            Input: s = ""
            Output: 0
                    */
        int ans=longestValidParentheses(a);
        System.out.println(ans);

    }
    static int longestValidParentheses(String s) {
        Stack<Integer> stk=new Stack<>();
        stk.push(-1);
        char[] c=s.toCharArray();
        
        int depth=0;
        for(int i=0;i<c.length;i++)
        {
            char ch=c[i];
            if(ch=='(')
            {
                stk.push(i);
               
               
            } 
            else{
                stk.pop();
                if(stk.isEmpty())
                {
                    stk.push(i);
                }
            }
            depth=Math.max(depth,i-stk.peek());
        }

        return depth;
    }
}
