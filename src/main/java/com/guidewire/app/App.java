package com.guidewire.app;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        int[] numbers = {4,6,2,7,4,6,4,5,3,2};
        Sort sorter = new Sort();
        
        Util.printMessage(Util.toString(numbers));
        sorter.sort(numbers);
        Util.printMessage(Util.toString(numbers));

        String s1 = "Hello ";
        String s2 = "World";
        Util.printMessage(sorter.concat(s1,s2));

        int [] primes = {1,3,7,13};
        Util.printMessage("Are all numbers in the list prime numbers? "+ sorter.isListPrime(primes));

        sorter.lotsOfFors();
    }
}
