package Monday;

import java.util.Stack;

public class adj_duplicates_rem {
    public static void main(String[] args) {
        Stack<Character> stk=new Stack<>();
        String a="abbaca";
        for(char ch:a.toCharArray())
        {
            if(stk.isEmpty())
            {
                stk.push(ch);
            }
            else if(stk.peek()!=ch)
            {
                stk.push(ch);
            }
            else{
                stk.pop();
                
            }
        }
        System.out.println(stk);
        StringBuilder sb=new StringBuilder();
        for(char c:stk)
        {
            sb.append(c);
        }
        String k=new String(sb);
        System.out.println(k);
        

    }

}
