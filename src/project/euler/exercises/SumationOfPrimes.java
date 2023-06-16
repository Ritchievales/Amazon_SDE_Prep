package project.euler.exercises;

public class SumationOfPrimes {

    /*boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i<=n/2;i++){
            if((n%i)==0)
                return  false;
        }
        return true;
    }*/

    public long sieveOfEratosthenes(int n){
        long sumOfPrimes=0;
        // Create a boolean array "prime[0..n]" and initialize
        // all entries it as true. A value in prime[i] will
        // finally be false if i is Not a prime, else true.
        boolean[] prime = new boolean[n+1];
        for(int i=0;i<=n;i++)
            prime[i] = true;

        for(int p = 2; p*p <=n; p++){
            // If prime[p] is not changed, then it is a prime
            if(prime[p]){
                // Update all multiples of p
                for(int i = p*p; i <= n; i += p)
                    prime[i] = false;
            }
        }

        // Print all prime numbers
        for(int i = 2; i <= n; i++){
            if(prime[i]) {
                //System.out.print(i + " ");
                sumOfPrimes+=i;
            }
        }
        return sumOfPrimes;
    }

    public long getSumOfPrimes(int n){
        //remove previous implementation because took FOREVER...
        //This needs to be done using Sieve of Eratosthenes algo...
        return sieveOfEratosthenes(2000000);
    }
}
