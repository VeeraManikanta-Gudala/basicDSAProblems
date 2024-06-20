package Friday.Questions;
import java.util.Arrays;
public class TrainStation {
    public static void main(String[] args) {
        int n = 3;
        int arr[] = {900, 1100, 1235};
        int dep[] = {1000, 1200, 1240};
        int res = 0,i=0,j=0,count = 0;
        Arrays.sort(arr);
        Arrays.sort(dep);
        while(i<n){
            if(arr[i] <= dep[j]){
                count++;
                res = Math.max(res,count);
                i++;
            }
            else{
                count--;
                j++;
            }
        }
        System.out.println(res);
    }
}
