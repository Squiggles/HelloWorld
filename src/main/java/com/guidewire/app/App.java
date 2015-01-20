package com.guidewire.app;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        int[] numbers = {4,6,2,7,4,6,4,5,3,2};
        Sort sorter = new Sort();
        
        Util.printMessage(numbers.toString());
        sorter.sort(numbers);
        Util.printMessage(numbers.toString());
    }
}
