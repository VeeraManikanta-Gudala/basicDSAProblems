package Monday;

import java.util.Arrays;

public class Removing {
    static boolean contains(int[] arr,int n, int c){
        int count=0;
        for (int i = 0; i<arr.length-c;i++) {
            if (arr[i] == n) count++;
        }
        System.out.println(Arrays.toString(arr));
        return count == 1;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3,4,4,5,6,1};
        int count = 0;
        for(int i = 0; i< arr.length;i++){
            if(!contains(arr,arr[i],count)){
                int del = arr[i];
                count++;
                for(int k= 0; k<arr.length;k++){
                    if(arr[k] == del){
                        for(int j = k;j<arr.length-1;j++){
                            arr[j] = arr[j+1];
                        }
                    }
                }
            }
        }
        for (int i = 0; i < arr.length-count; i++) {
            System.out.println(arr[i]);
        }
    }
}
