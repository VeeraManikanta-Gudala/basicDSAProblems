import java.util.*;

public class palin {
    public static void main(String[] args) {
        Stack<Character> obj = new Stack<>();
        String a = "raceacar";
        
        for(char ch : a.toCharArray()) {
            obj.push(ch);
        }
        for(char ch:a.toCharArray())
        {
            if(obj.peek()==ch)
            {
                obj.pop();
            }
        }
        System.out.println(obj);
        if(obj.isEmpty()) {
            System.out.println("palindrome");
        } else {
            System.out.println("not a palindrome");
        }
    }
}
