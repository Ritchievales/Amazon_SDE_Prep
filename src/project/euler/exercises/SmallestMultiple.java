package project.euler.exercises;

import static java.lang.Integer.MAX_VALUE;

public class  SmallestMultiple{
    public int getSmallestMultiple(){
        for(int i=1;i<MAX_VALUE ;i++){
            for(int j=1;j<=20;j++){
                if(i%j!=0)
                    break;
                if(i%j==0 && j==20)
                    return i;
            }
        }
        return 0;
    }
}
