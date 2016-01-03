package Algorithms;

/**
 * Created by Martin on 12/22/2015.
 */
public class LinearSearch {

    public static boolean linearSearch(int toFind , int [] inputArray ){
        boolean isFound = false;

        for(int i = 0 ; i < inputArray.length ; i++){
            if(inputArray[i] == toFind){
                isFound = true;
                return isFound;
            }
        }
        return isFound;
    }
}
