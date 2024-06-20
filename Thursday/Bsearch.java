package Thursday;

public class Bsearch {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6};
        int s = 0;
        int e = arr.length;
        int m = 0;
        int target = 5;
        while(s<e){
            m = (s+e) / 2;
            if(arr[m]>target){
                e = m;
            } else if (arr[m] == target) {
                System.out.println("Target found at index " + m);
                return;
            }else{
                s = m;
            }
        }
        System.out.println("target not found in the array");
    }
}
