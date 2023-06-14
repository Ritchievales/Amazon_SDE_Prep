package project.euler.exercises;

import java.util.LinkedList;
import java.util.List;

public class LargestPrimeFactor {

    public void getLargestPrimeFactor(){
        List<Long> result = new LinkedList<>();
        long a = 600851475143L;
        long i = 2;
        while(a>1){
            if(a%i==0){
                result.add(i);
                a=a/i;
            }
            i++;
        }
        System.out.println(result);
    }
}
