package Thursday;

public class Rec {
    public static void main(String[] args) {
        System.out.println(isPrime(22,2));
    }
    // wont work with 2,just put a small if statement in the main function.
    static boolean isPrime(int n,int d){

        if(n%d==0){
            return false;
        }
        if(d==n/2 && isPrime(n,d+1)){
            return true;
        }
        return true;

    }
}
