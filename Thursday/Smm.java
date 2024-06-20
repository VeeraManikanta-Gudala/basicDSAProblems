package Thursday;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Smm {

    public static void main(String[] args) {

//            int rupees,notes_20=0,notes_10=0,notes_5=0,
//                    coin_2=0,
//                    coin_1=0;
//            Scanner sc = new Scanner(System.in);
//            rupees=sc.nextInt();
//            if(rupees > 20) {
//                notes_20= rupees / 20;
//                rupees = rupees % 20;
//            }
//            if(rupees > 10) {
//                notes_10= rupees / 10;//
//                rupees = rupees % 10;
//            }
//            if(rupees > 5) {
//                notes_5= rupees / 5;
//                rupees = rupees % 5;
//            }
//            if(rupees > 2) {
//                coin_2= rupees / 2;
//                rupees = rupees % 2;
//            }
//            if(rupees == 1) {
//                coin_1= rupees;
//            }
//
//            if(notes_20 > 0) System.out.println("20 Notes--->"+notes_20);
//            if(notes_10 > 0) System.out.println("10 Notes--->"+notes_10);
//            if(notes_5 > 0) System.out.println("5 Notes--->"+notes_5);
//            if(coin_2 > 0) System.out.println("2 coins--->"+coin_2);
//            if(coin_1 > 0) System.out.println("1 coins--->"+coin_1);
//
//
//
//
//            int[] arr={1,2,4,2,5,5,5,5,5,1,1,3,3,5,2,3,3,3,4};
////        ArrayList<Integer> lst = new ArrayList<>();
//
//       for(int i = 0; i<arr.length;i++){
//           if(arr[])
//       }
//        System.out.println(mmap.size());
////            int count = 0;
//            for(int i = 0 ; i< arr.length-1;i++){
//                if(arr[i] == arr[i+1]){
//                    count ++;
//                }
//            }
//        System.out.println(arr.length-count);

//
//                String countryName="IndIA";
//                String cap = getCountryCapital(countryName);
//                System.out.println("India Capital->"+cap);
//
//
//            }
//
//
//            private static String getCountryCapital(String country) {
//
//                if(country.equalsIgnoreCase("India")) return "Delhi";
//                else if(country.equalsIgnoreCase("UK")) return "London";
//                else if(country.equalsIgnoreCase("USA")) return "W.D.C";
//                return "Country not defined";
//


        for (int num = 5; num <= 240; num++) {
            if (isPrime(num) && containsSeven(num)) {
                System.out.print(num + " ");
            }
        }
    }

    public static boolean isPrime(int num) {

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean containsSeven(int num) {
        while (num > 0) {
            if (num % 10 == 7) {
                return true;
            }
            num /= 10;
        }
        return false;
    }
}




