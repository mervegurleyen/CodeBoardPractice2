import java.util.Scanner;

public class isPostive {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt();

        System.out.println("Please enter " +size+ " number");

        int[] arr2 = new int[size];
        for(int i=0 ;i<size;i++){
            arr2[i]=inp.nextInt();

        }
        isPos(arr2);


    }
    public static void isPos(int[] arr) {

        for (int i = 0; i <arr.length; i++) {
            if (arr[i] > 0) {
                System.out.println("positive");
            }
            else{
                System.out.println("not positive");
            }
        }
    }
}

//isPositive is a method that checks if each element in the array arr positive or not positive
//
//If the element is positive print positive else print not positive
//
//Complete main method by calling isPositive method.
//
//Note: you might want to use for loop and if/else statement
//
//Note: your first input is the number of ints in array, all other inputs will be values of array's elements.