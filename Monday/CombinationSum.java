import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        int[] arr = {1,4,9,16,25};
        int target = 12;
        List<List<Integer>> result = new ArrayList<>();
        findComboSum(arr, target, 0, new ArrayList<>(), result);
        
        // Print the result
        for (List<Integer> combination : result) {
            System.out.println(combination);
        }
    }
  
    static void findComboSum(int[] arr, int target, int startIndex, List<Integer> currentCombination, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(currentCombination));
            return;
        }
        
        if (target < 0) {
            return;
        }
        
        for (int i = startIndex; i < arr.length; i++) {
            currentCombination.add(arr[i]);
            findComboSum(arr, target - arr[i], i, currentCombination, result); // Allow the same element to be reused
            currentCombination.remove(currentCombination.size() - 1); // Backtrack
        }
    }
}




  //     int sumnow = 0;
    //     int indList = 0;
    //     int temp;
    //     ArrayList<ArrayList<Integer>> res = new ArrayList<>();
    //     ArrayList<Integer> resnow = new ArrayList<>();
    //     for(int i = 0 ; i<arr.length;i++){
            
    //         for(int j = i; j<arr.length;){
    //             sumnow += arr[j];
    //             if(sumnow < k){
    //                 resnow.add(arr[j]);
    //                 indList++;
    //                 j=i;
    //             }else if(sumnow>k){
    //                 // resnow.remove(indList);

    //                 sumnow -= arr[j];
    //                 if(!(indList==0)){
    //                     temp = resnow.remove(indList);
    //                     if(!(temp == resnow.get(indList)) && j>0){
    //                         resnow.add(temp);
    //                     }
    //                 }
    //                 j++;
    //             }
    //             else{
    //                 res.add(resnow);
    //                 resnow.clear();
    //                 sumnow = 0;     
    //                 // indList = 0;   
    //             }
    //         }
            

    //     }
    //     // findcombosum(arr,k,startingindex,0,res);

    //     System.out.println(res);


    // }
