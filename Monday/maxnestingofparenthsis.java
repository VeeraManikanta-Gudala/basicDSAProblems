import java.util.Stack;

public class maxnestingofparenthsis{
    public static void main(String[] args) {
       
        String a="(1+(2*3)+((8)/4))+1";
        
        int k=findnestdepth(a);
        System.out.println("Max depth:"+k);
    }
    static int findnestdepth(String a)
    {
        Stack<Character> stk=new Stack<>();
        int depth=0;
        int currcnt=0;
        for(int i=0;i<a.length();i++)
        {
            
            
           char ch=a.charAt(i);
           if(ch=='(')
           {
            stk.push(ch);
            currcnt++;
            depth=Math.max(depth,currcnt);
           }
           else if(ch==')'){
            if(!stk.isEmpty()&&stk.peek()=='(')
            {
                stk.pop();
                currcnt--;
            }
           }

        }
        return depth;
    }
}