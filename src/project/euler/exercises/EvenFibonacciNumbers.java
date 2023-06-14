package project.euler.exercises;

public class EvenFibonacciNumbers {
    public void sumOfEvenValuesInFibonacci(){
        int i = 1;
        int j = 2;
        System.out.println(i);
        System.out.println(j);
        int currentNumber = i+j;
        int evenSum = 2;
        while(currentNumber <= 4000000){
            System.out.println(currentNumber);
            if(currentNumber%2==0){
                evenSum+=currentNumber;
            }
            System.out.println("Even Sum = " + evenSum);
            i = j;
            j = currentNumber;
            currentNumber = i+j;

        }
        System.out.println("Even Sum = " + evenSum);
    }
}
