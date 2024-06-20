package Friday;

import java.util.Stack;

public class Parenthesis {
    public static void main(String[] args) {
        String s = "{([()8 {}])}";
        Stack<Character> store = new Stack<>();
        for(int i = 0;i < s.length();i++){
            if(s.charAt(i)=='{' || s.charAt(i)=='(' || s.charAt(i) == '['){
                store.push(s.charAt(i));
            } else if ((s.charAt(i) == ')' && store.peek()=='(') ||
                    (s.charAt(i) == '}' && store.peek()=='{') ||
                    (s.charAt(i) == ']' && store.peek()=='[')) {
                store.pop();
            }
        }
        if(store.isEmpty()){
            System.out.println("it is valid parenthesis");
        }
        else {
            System.out.println("not a valid parenthesis");
        }
    }
}
