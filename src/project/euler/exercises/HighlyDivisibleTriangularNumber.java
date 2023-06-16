package project.euler.exercises;

import java.lang.reflect.Array;
import java.util.List;

public class HighlyDivisibleTriangularNumber {

    public int getDivisors(int n){
        int counter = 0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                counter++;
            }
        }
        return counter;
    }

    public void getTriangleNumberWith500Divisors(){
        int number = 0;
        int divs = 0;
        int i =1;
        while(getDivisors(number)<500){
            number+=i;
            System.out.println("number "+number);
            System.out.println();
            i++;
        }
    }
}
