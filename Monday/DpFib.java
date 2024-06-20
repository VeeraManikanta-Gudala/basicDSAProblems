package Monday;

import java.util.Scanner;

public class DpFib {
    public  static  long dpfib(int n){
        int[] fib = new int[n+1];
        fib[0] = 1;
        fib[1] = 1;
        for(int i = 2; i < n+1; i++){
            fib[i] = fib[i-1] +fib[i-2];
        }
        return fib[n];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find fibanocci of");
        int n = sc.nextInt();
        long res = dpfib(n);
        System.out.println(res);




    }
}
