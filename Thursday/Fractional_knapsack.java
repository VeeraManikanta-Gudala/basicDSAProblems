import java.util.TreeMap;

public class Fractional_knapsack {
   public static void main(String[] args) {
     int weights[]={10,20,30};
     int values[]={60,100,120};
     int maxweight=50,val=0;
     TreeMap<Double,Double> tm=new TreeMap<>();
     for(int i=0;i<weights.length;i++){
        tm.put((double)(values[i]/weights[i]), (double)(weights[i]));
     }
     System.out.println(tm);
    
   }

























}
