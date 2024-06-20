import java.util.Stack;

class MyStack{
    Stack<Integer> stk=new Stack<Integer>();
    void push(int a)
    {
        stk.push(a);
        System.out.println("pushed:"+a);
    }
    void pop(){
        // stk.pop();
        System.out.println(stk.pop()+"popped:");
    }

}


public class n1 {
    public static void main(String[] args) {
        MyStack obj=new MyStack();
        obj.push(10);
        obj.push(12);
        System.out.println(obj.stk);
        // obj.pop();
        System.out.println(obj.stk.peek());
        
    }
}
