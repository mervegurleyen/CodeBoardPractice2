import java.util.Scanner;

public class returnMax {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter 2 numbers");
        int num1=scan.nextInt();
        int num2=scan.nextInt();

        System.out.println(max(num1,num2));

    }
    public static int max(int x,int  max) {

        if (x>max){
            return x;
        }
        else
        return max;
    }
}

//Prompt user for two integers, save them to variables
//
//Then call max method.
//
//max method gets two ints, x and max.
//
//x is the test case, max is what we test against.
//
//if x is bigger than max return x
//
//in any other case return max.
//
//for example:
//
//max(10,1)
//
//returns 10
//
//max(5,11)
//
//returns 11