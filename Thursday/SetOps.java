package Thursday;

import java.util.HashMap;

public class SetOps {
    public static void main(String[] args) {
        String s = "abbcccdddd";
        HashMap<Character,Integer> mapp = new HashMap<>();
        for(int i =0;i<s.length();i++){
            mapp.put(s.charAt(i),i);
        }
        System.out.println(mapp.size());
        int[] storing = new int[26];
        for(int i = 0;i<s.length();i++){
            storing[s.charAt(i) - 'a']++;
        }
        int count = 0;
        for(int i = 0 ; i<storing.length;i++){
            if(storing[i] == (i+1)){
                count++;
            }
        }
        System.out.println(count == mapp.size());


    }}
