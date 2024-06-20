import java.util.Scanner;

public class MinimumOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of aray:");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("enter array elements");
        for (int i = 0; i <n; i++) {
            a[i] = sc.nextInt();
        }
        int min = a[0];
        for(int i = 0 ; i < n; i++){
            if(a[i] < min){
                min = a[i];
            }
        }
        System.out.println("Minimum element in the array is : " + min);
    }
}
