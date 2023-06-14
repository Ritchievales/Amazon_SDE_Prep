package project.euler.exercises;

import java.util.Collections;
import java.util.LinkedList;

public class LargestPalindromeProduct {

    public boolean isPalindrome(int x){
        String a = Integer.toString(x);

        StringBuilder sb = new StringBuilder();
        for (int i=a.length()-1;i>=0;i--) {
            sb.append(a.charAt(i));
        }

        return a.equals(sb.toString());
    }

    public int getLargestPalindromeProduct(){
        //For 3 digits;
        LinkedList<Integer> l = new LinkedList<>();
        for(int i=999;i>=100;i--){
            for(int j=999;j>=100;j--){
                if(isPalindrome(i*j))
                    l.add(i*j);
            }
        }
        return Collections.max(l);

    }
}
