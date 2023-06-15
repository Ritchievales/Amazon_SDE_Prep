package project.euler.exercises;

public class SpecialPythagoreanTriplet {

    public void printTriplet(){
        for (int a = 1; a < 1000; a++) {
            for (int b = a; b < 1000; b++) {
                for (int c = b; c < 1000; c++) {
                    if ((a * a) + (b * b) == (c * c) ) {
                        if(a+b+c==1000) {
                            System.out.println(a + ", " + b + ", " + c);
                            System.out.println(a*b*c);
                        }
                    }
                }
            }
        }
    }
}
