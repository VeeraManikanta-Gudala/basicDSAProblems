package Friday;

import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        int[] arr = new int[4];
        System.out.println(arr.length);
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            arr[i] =sc.nextInt();
        }

//        int j = 0;
        for(int i = 0;i<arr.length;i++){
            for (int k = 0; k < arr.length; k++) {
                if(arr[i]*2 == arr[k]){
                    System.out.println("Yes");
                    return;
                }
            }

        }
        System.out.println("no");
    }
}
