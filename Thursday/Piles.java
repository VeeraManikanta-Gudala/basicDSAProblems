package Thursday;

import java.util.*;

public class Piles{
    public static void main(String[] args) {
        int[] scores1 = {1, 2, 3, 5};
        int[] ages = {8, 9, 10, 1};
        int[] inidces = new int[ages.length];
        for (int i = 0; i < inidces.length; i++) {
            inidces[i] = ages[i];
        }
        int n = ages.length;
        int[] indices = new int[n];
        int[] sortedArray = ages.clone();

        for (int i = 0; i < n; i++) {
            indices[i] = i;
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (sortedArray[j] > sortedArray[j + 1]) {
                    // Swap elements in sortedArray
                    int tempValue = sortedArray[j];
                    sortedArray[j] = sortedArray[j + 1];
                    sortedArray[j + 1] = tempValue;


                    int tempIndex = indices[j];
                    indices[j] = indices[j + 1];
                    indices[j + 1] = tempIndex;
                }
            }
        }
        System.out.println(Arrays.toString(indices));
        int maxScore = 0;
        for(int i =0;i<indices.length-1;i++){
            if(scores1[inidces[i+1]]<scores1[inidces[i]]){
                continue;
            }else{
                maxScore+=scores1[indices[i]];
            }
        }
        System.out.println(maxScore);
    }
}