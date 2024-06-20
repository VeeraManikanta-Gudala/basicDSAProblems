
import java.util.Stack;

public class LargestRectArea {
    public static void main(String[] args) {
        int[] arr={60,20,50,40,10,50,60};
        int n=arr.length;
        int ans=findlarrec(arr,n);
        System.out.println(ans);
    }
    static int findlarrec(int[] height,int n)
    {
        //stack to store index of bars
        Stack<Integer> stk=new Stack<>();
        int maxArea=0;
        int index=0;
        while(index<height.length)
        {
            //add the curr bar into my stack
            //{60,20,50,40,10,50,60};
            if(stk.isEmpty()||height[index]>=height[stk.peek()])
            {
                stk.push(index++);
            }
            else{
                int h=height[stk.pop()];
                int width=stk.isEmpty()?index:index-stk.peek()-1;
                maxArea=Math.max(maxArea,h*width);
            }
        }
        //pop all elements from stack
        while(!stk.isEmpty()){
            int h=height[stk.pop()];
            int width=stk.isEmpty()?index:index-stk.peek()-1;
            maxArea=Math.max(maxArea,h*width);
        }
        return maxArea;

    }


}
