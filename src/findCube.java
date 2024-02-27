import java.util.Scanner;

public class findCube {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.println("Please enter a number");
        int num = inp.nextInt();

        System.out.println(cube(num));

    }

    public static int cube(int n){

        int a;
        a=n*n*n;

        return a;
    }

}


//Given method called cube. Ask the user for a number,
// call the cube method and pass this number as a parameter.
// Write all required code inside cube method in order calculate the cube of a number.
//
//Example:
//
//input: 5
//
//output: 125
//
//hint: cube of a number n = n*n*n