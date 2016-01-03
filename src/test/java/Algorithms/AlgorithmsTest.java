package Algorithms;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class AlgorithmsTest {

    private int[] test;

    @Before
    public void setUp() {
        test = new int[6];
        test[0] = 2;
        test[1] = 1;
        test[2] = 8;
        test[3] = 7;
        test[4] = 4;
        test[5] = 3;


    }

    @Test
    public void linearSearchTest() {
        assertTrue(LinearSearch.linearSearch(1, test));
    }

    @Test
    public void bubbleSortTest(){
        int [] temp = {2,1,8,7,4,3};
        int [] sorted = BubbleSort.bubbleSort(temp);
        assertFalse(sorted.equals(test));
        assertTrue(sorted.equals(temp));
    }

    @Test
    public void binarySearchTest() {
        int [] temp = {2,1,8,7,4,3};
        int [] sorted = BubbleSort.bubbleSort(temp);
        assertTrue(BinarySearch.binarySearch(sorted,1));
    }
}
