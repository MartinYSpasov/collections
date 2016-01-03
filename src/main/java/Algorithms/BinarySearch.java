package Algorithms;

public class BinarySearch {

    public static boolean binarySearch(int[] searchArray, int searchNumber) {
        int lowIndex = 0;
        int highIndex = searchArray.length - 1;
        while (lowIndex <= highIndex) {
            int middleIndex = (highIndex + lowIndex) / 2;
            if (searchArray[middleIndex] < searchNumber) {
                lowIndex = middleIndex + 1;
            } else if (searchArray[middleIndex] > searchNumber) {
                highIndex = middleIndex - 1;
            } else {
                return true;
            }
        }
        return false;
    }


}
