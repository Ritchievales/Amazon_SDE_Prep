package project.euler.exercises;

import java.lang.reflect.Array;
import java.util.List;

public class HighlyDivisibleTriangularNumber {

    //This takes forever!!! I found a solution I found a good solution but this was the one I could came up with... so uploading this.
    public int getDivisors(int n){
        int counter = 0;
        int sqrt = (int) Math.sqrt(n);

        for (int i = 1; i <= sqrt; i++) {
            if (n % i == 0) {
                counter += 2;
            }
        }
        if (sqrt * sqrt == n) {
            counter--;
        }

        return counter;
    }


    public int getTriangleNumberWith500Divisors(){
        int number = 0;
        int divs = 0;
        int i =1;
        while(getDivisors(number)<500){
            number+=i;
            //System.out.println("number "+number);
            i++;
        }
        return number;
    }
}
