import java.util.Arrays;
import java.util.Scanner;

public class addToArray {

    public static void main(String[] args) {

        int[] arr={1,5,77,8};
        add_to_r(arr,2);

    }

    public static int[] add_to_r(int[] initialArray,int newNumber) {
        //create new array with one more position.

        int[] newArr = new int[initialArray.length+1];
        for(int i = 0; i < initialArray.length; i++) {
            newArr[i] = initialArray[i];
        }
        newArr[newArr.length-1] = newNumber;

        return newArr;
    }

}


//add_to_r is a method that gets an array and a number.
//
//the method creates a new array bigger by one then (int[] r).
//
//It populates the new array with the old ones(r) values.
//
//and finally in the last position adds the number (int n) to it.
//
//for example:
//
//method input: add_to_r(new int{1,5,77,8}  ,2)
//
//outputs (int array):
//
//[1, 5, 77, 8, 2]
//
//Note: In main method create an array and populate it with the values {1,5,77,8}.
//      Call the method add_to_r and pass the created array and 2 as a parameters.
//      Print the result.