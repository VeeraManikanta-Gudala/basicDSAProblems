
import java.util.HashMap;

public class Activity_prblm{
    public static void main(String[] args) {
        HashMap<Integer,Integer> res=new HashMap<>();

        int[] start={1,2,4,1,5,8};
        int[] end={3,5,7,8,9,10};
        int countTasks=1;
        res.put(start[0],end[0]);
        int startTime=start[0],endTime=end[0];
        for(int i=1;i<start.length;i++){
            if(start[i]>endTime){
                endTime=end[i];
                res.put(start[i],end[i]);
                countTasks++;
            }
        }

        System.out.println(countTasks);
        System.out.println(res);

    }
    
}