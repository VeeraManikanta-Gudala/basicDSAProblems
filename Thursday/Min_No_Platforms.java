
import java.util.Arrays;

public class Min_No_Platforms {
    public static void main(String[] args) {
        int[] arrival={900,940,950,1100,1500,1800};
        int[] dep={910,1200,1120,1130,1900,2000};
        
      
        int minplatforms=find(arrival,dep);
        System.out.println(minplatforms);
       
    }

    private static int find(int[] arrival, int[] dep) {
        Arrays.sort(dep);
        Arrays.sort(arrival);
        int platform=0;
        int maxPlatformsNeeded=0;
        int dep_Index=0,arrival_index=0;
        while(arrival_index<arrival.length&&dep_Index<dep.length){
            if(arrival[arrival_index]<dep[dep_Index]){
                platform++;
                maxPlatformsNeeded=Math.max(maxPlatformsNeeded,platform);
                arrival_index++;
            }else{
                platform--;
                dep_Index++;
            }
        }
        return maxPlatformsNeeded;
    }
}
