public class Coin_change {
    public static void main(String[] args) {
        int coins[]={1,2,5,10,20,50,100,500,1000};
        int target=200;
        coinChange(coins, target);

    }
    static void coinChange(int[] coins,int target){
        int countDenomonination=0;
        int index=coins.length-1;
        while(index>=0){
            if(coins[index]<=target){
                target-=coins[index];
                countDenomonination++;
                System.out.print(coins[index]+" ");
            }
            else{
                index--;
            }
        }
        System.out.println(":"+countDenomonination);


        // for(int i=coins.length-1;i>=0;i--){
        //     if(target==coins[i]){
        //         System.out.println(coins[i]);
        //         break;
        //     }
        //     else if(coins[i]>target){
                                
        //     }
        //     else{
        //         target=target-coins[i];
        //         System.out.println(coins[i]);
        //     }
        // }

    }
}
