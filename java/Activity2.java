package activities;

import java.util.*;

public class Activity2 {
    public static void main(String[] args) {
        //Initialize the array
        int[] numArray = {10, 77, 10, 54, -11, 10};
        System.out.println("Original Array: " + Arrays.toString(numArray));
        
        //Set constants
        int searchNum = 10;
        int fixedSum = 30;

        //Print result
        System.out.println("Result: " + result(numArray, searchNum, fixedSum));
    }

    static boolean result( int[] Array1, int searchNum, int fixedSum) {
    	int sum = 0;
    	for (int x: Array1) {
    		if (x == searchNum) {
    		sum = sum + searchNum;
    		}
    		
    		if (sum > fixedSum) {
    		break;		
    		}
    	}
    	
    	return sum == fixedSum;
    }
}