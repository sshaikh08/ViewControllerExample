package com.example.shariq.viewcontrollerexample;

import java.util.ArrayList;
//this class contains all the method which generate a numerical value for the corresponding euler problem
/**
 * Created by Shariq on 12/12/2014.
 */
public class EulerSolutons {

    public String eulerSolOne() {
        int sum = 0;
        for (int i = 0; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0)
                sum += i;
        }
        return Integer.toString(sum);
    }


    public String eulerSolTwo() {
        int sum = 0;
        for (int i = 0; ; i++) {
            int fib = fibonacci(i);
            if (fib > 4000000)
                break;
            if (fib % 2 == 0)
                sum += fib;
        }
        return Integer.toString(sum);
    }
    private static int fibonacci(int x) {
        if (x < 0 || x > 46)
            throw new IllegalArgumentException();
        int a = 0;
        int b = 1;
        for (int i = 0; i < x; i++) {
            int c = a + b;
            a = b;
            b = c;
        }
        return a;
    }

    public String eulerSolThree() {
        long input = 600851475143l;
        long maxUniqueFactor = (long) Math.ceil(Math.sqrt(input));
        ArrayList<Long> factors = new ArrayList<Long>();
        for (long i = 2; i <= maxUniqueFactor; i++) {
            if (input % i == 0) // i is a factor of the input
            {
                if (isPrime(i)) { // Check if i is prime.
                    factors.add(i);
                } else if (isPrime(input / i)) { //Check if i's companion is prime.
                    factors.add(input / i);
                }
            }

        }
        long max = 0;
        for (int i = 0; i < factors.size(); i++){
            if(factors.get(i) > max){
                max = factors.get(i);
            }
        }

        return Long.toString(max);
    }
    private static boolean isPrime(long l)
    {
        for (int i = 2; i <= l/2 -1; i++)
        {
            if (l % i == 0)
                return false;
        }
        return true;
    }
}
