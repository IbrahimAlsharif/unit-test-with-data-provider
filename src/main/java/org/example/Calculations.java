package org.example;

public class Calculations {
    // note that factorial function should handle the negative numbers correctly,
    // but it's not included here, because this implementation is made for sake of
    // explaining the unit tests' usage only
    public int factorial(int number){
        int factorial =1;
        while (number >1){
            factorial = factorial * number;
            number--;
        }
        return factorial;
    }
}
