import java.util.Stack;

public class maxDepth {
    public static void main(String[] args) {
        String a= "()(())((()()))";
        // String a="(1+(2*3)+((8)/4))+1";
        //valid paren
        //for 8 the max depth is there(leftpar-reght paren)
        /*  
        Output: 3 
        Digit 3 is inside of 3 nested parentheses in the string.
        
        Input: s = "()(())((()()))"
        Output: 3

        */
        int ans=maxDepthfun(a);
        System.out.println(ans);
    }
    static int maxDepthfun(String s) {
        Stack<Character> stk=new Stack<>();

        char[] c=s.toCharArray();
        int currcnt=0;
        int depth=0;
        for(int i=0;i<c.length;i++)
        {
            char ch=c[i];
            if(ch=='(')
            {
                stk.push(ch);
                currcnt++;
                depth=Math.max(currcnt,depth);

            }
            else if(ch==')')
            {
                if(!stk.isEmpty()&&stk.peek()=='(')
                {
                    stk.pop();
                    currcnt--;
                }
            }
            
        }
        return depth;
        //approach 1
        // int lc=0;
        // int rc=0;
        // int depth=0;
        // int k=0;
        // for(int i=0;i<c.length;i++)
        // {
        //     char ch=c[i];
        //     if(ch!='(' && ch!=')')
        //     {
        //         continue;
                
        //     }else if(ch=='('){
        //         lc++;
        //     }
        //     else{
        //         rc++;
        //     }
        //     k=lc-rc;
        //     depth=Math.max(depth,k);
        // }
        // return depth;
    }

}
