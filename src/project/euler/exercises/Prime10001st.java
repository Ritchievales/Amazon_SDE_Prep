package project.euler.exercises;

public class Prime10001st {

    public boolean isPrimeNumber(int x){
        int i=0;
        boolean flag = true;
        int m=x/2;
        for(i=2;i<=m;i++) {
            if (x % i == 0) {
                //System.out.println(x + " is not prime number");
                flag = false;
                break;
            }
        }
        //if(flag)  { System.out.println(x+" is prime number"); }
        return flag;
    }

    public int get10001stPrimeNumber(){
        int counter = 1;
        int i=1;
        while(counter<=10001){
            i++;
           if(isPrimeNumber(i))
               counter++;

        }

        return i;
    }
}
