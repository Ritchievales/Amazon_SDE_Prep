package project.euler.exercises;

public class SumSquareDifference {

    public int getSumOfSquares(int n){
        int sum =0;
        for(int i=1;i<=n;i++){
            sum+=(i*i);
        }
        System.out.println(sum);
        return  sum;
    }

    public int getSquareOfSum(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        System.out.println(sum*sum);
        return sum*sum;
    }

    public int getSumSquareDifference(int n){
        System.out.println(n);
        return getSquareOfSum(n)-getSumOfSquares(n);
    }
}
