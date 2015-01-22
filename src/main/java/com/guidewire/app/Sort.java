package com.guidewire.app;

import java.util.ArrayList;
import java.util.Collections;

public class Sort {
    private int[] numbers;
    private int number;
    public static final long DEFAULT_RECURSIVE_INVOCATION_DELAY = 1;

    public void sort(int[] values) {
        // check for empty or null array
        if (values == null || values.length == 0) {
            return;
        }
        this.numbers = values;
        number = values.length;
        quicksort(0, number - 1);
    }

    private void quicksort(int low, int high) {
        int i = low, j = high;
        // Get the pivot element from the middle of the list
        int pivot = numbers[low + (high - low) / 2];

        // Divide into two lists
        while (i <= j) {
            // If the current value from the left list is smaller then the pivot
            // element then get the next element from the left list
            while (numbers[i] < pivot) {
                i++;
            }
            // If the current value from the right list is larger then the pivot
            // element then get the next element from the right list
            while (numbers[j] > pivot) {
                j--;
            }

            // If we have found a values in the left list which is larger then
            // the pivot element and if we have found a value in the right list
            // which is smaller then the pivot element then we exchange the
            // values.
            // As we are done we can increase i and j
            if (i <= j) {
                exchange(i, j);
                i++;
                j--;
            }
        }
        // Recursion
        if (low < j)
            quicksort(low, j);
        if (i < high)
            quicksort(i, high);
    }

    private void exchange(int i, int j) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }

    //A simple method to concatenate two strings
    public String concat(String one, String two) {
        return one + two;
    }

    //checks whether an int is prime or not.
    public boolean isPrime(int n) {
        //check if n is a multiple of 2
        if (n % 2 == 0) return false;
        //if not, then just check the odds
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public boolean isListPrime(int[] nums) {
        for (int i : nums) {
            if (!this.isPrime(i)) {
                return false;
            }
        }
        return true;
    }

    public void lotsOfFors() {
        ArrayList<String> strings = new ArrayList<String>();
        ArrayList<String> words = new ArrayList<String>();
        for (int i = 0; i < 10000; i++) {
            String[] letters = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
            ArrayList<String> alpha = new ArrayList();
            for (String a : letters) {
                alpha.add(a);
            }
            Collections.shuffle(alpha);
            String word = "";
            for (int j = 0; j < 6; j++) {
                word += alpha.get(j);
            }
            words.add(word);

        }
        for (String word : words) {
            System.out.printf("This is the word : %s\n", word);
        }
    }


    /**
     * Delay [ms] in recursive invocation
     */
    private long recursiveInvocationDelay = DEFAULT_RECURSIVE_INVOCATION_DELAY;

    public void setRecursiveInvocationDelay(final long recursiveInvocationDelay) {
        this.recursiveInvocationDelay = recursiveInvocationDelay;
    }

    /**
     * @return delay [ms] in recursive invocation
     */
    public long getRecursiveInvocationDelay() {
        return recursiveInvocationDelay;
    }

    public void f() {
        delay();
        f();
    }

    public boolean g() {
        delay();
        if (g()) {
            return true;
        } else {
            return g();
        }
    }

    public boolean h(final boolean in) {
        delay();
        if (in) {
            h(!in);
        }
        return false;
    }

    //really
    public int fibonacci(int n) {
        // delay();
        if (n < 0) {
            return 0;
        } else if (n < 2) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    private void delay() {
        try {
            Thread.sleep(recursiveInvocationDelay);
        } catch (InterruptedException e) {
            // interrupted
        }
    }
}
