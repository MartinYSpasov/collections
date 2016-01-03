package Algorithms;

public class BubbleSort {

    public static int []  bubbleSort(int [] inputArray){
        for (int i = inputArray.length - 1 ; i > 1 ; i--){
            for (int j = 0 ; j < i ; j++){
                if(inputArray[j] > inputArray[j+1]){
                    int temp = inputArray[j];
                    inputArray[j] = inputArray[j + 1];
                    inputArray[j + 1] = temp;
                }
            }
        }
        return inputArray;
    }
}
