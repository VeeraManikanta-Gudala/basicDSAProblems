package Friday;

import java.util.Stack;

public class redundantParan {
    static int getWeight(char[] leftSide ,char ch){
        int k=0;
        for(;k<leftSide.length;k++) {
            if(leftSide[k] == ch) break;
        }
        return k;
    }
    public static void main(String[] args) {
        String str = "{{}}";
        char[] lside = { '(' ,'[', '{' };
        int[] weight  = {  1,    2 ,  3  };
        char[] rside =  {  ')' ,']', '}' };
        char eachCh = ' ';
        Stack<Integer> stack = new Stack<Integer>();
        boolean isPerfect = true;
        for(int i=0;i<str.length();i++) {
            eachCh = str.charAt(i);
            if( (eachCh =='(') ||
                    (eachCh=='{') || (eachCh =='[')) {
                int k = getWeight(lside,eachCh);
                stack.push(weight[k]);
            }
            else {
                int k = getWeight(rside,eachCh);
                if( weight[k] != stack.pop()) {
                    isPerfect = false;
                }
            }// else
        }// for
        if( (isPerfect == true) && (stack.isEmpty() == true)) System.out.println("YES");
        else System.out.println("NO");
    }

}
