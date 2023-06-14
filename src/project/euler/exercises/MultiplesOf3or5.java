package project.euler.exercises;

public class MultiplesOf3or5 {
    public void getMultiplesOf3or5Sum(){
        int n = 1000;
        int sum = 0;
        for(int i=0;i<n;i++){
            if(i%5==0 || i%3==0){
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}
