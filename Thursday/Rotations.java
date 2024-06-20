package Thursday;

public class Rotations {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int[] newArr = new int[2* arr.length];
        int j=0;
        for(int i = 0; i< newArr.length;i++){
            newArr[i] = arr[j];
            j++;
            if(j==arr.length){
                j=0;
            }
        }
        int rot = 1;
        for(int i = rot;i< arr.length +rot;i++){
            System.out.println(newArr[i]);
        }
    }
}
