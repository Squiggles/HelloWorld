package com.guidewire.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Unit test for simple App.
 */
public class AppTest
        extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(AppTest.class);
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp() {

        assertTrue(true);
    }

    /**
     * A beautiful unit test for the Sort.sort method
     */
    public void testSort() {
        Sort sorter = new Sort();
        int[] numbers = {4, 6, 2, 7, 4, 6, 4, 5, 3, 2};
        int[] sortedNumbers = numbers;
        sorter.sort(numbers);
        ArrayList<Integer> numbersList = new ArrayList<Integer>();
        ArrayList<Integer> sortedNumbersList = new ArrayList<Integer>();
        for (int i : numbers) {
            numbersList.add(i);

        }
        for (int j : sortedNumbers) {
            sortedNumbersList.add(j);
        }
        Collections.sort(sortedNumbersList);
        assertEquals(numbersList, sortedNumbersList);
    }


    public void testConcat() {
        Sort mc = new Sort();
        String result = mc.concat("one", "two");
        assertEquals("onetwo", result);
    }


    public void testIsPrime() {
        Sort mc = new Sort();
        assertEquals(mc.isPrime(23), true);
    }


    public void testIsListPrime() {
        Sort mc = new Sort();
        int[] nums = {1, 3, 7};
        assertEquals(mc.isListPrime(nums), true);
    }

    public void testFib(){
        Sort mc = new Sort();
        assertEquals(mc.fibonacci(30),832040 );
    }
}
