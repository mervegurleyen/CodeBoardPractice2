import java.util.Scanner;

public class MethodsSignum {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();

        System.out.println(sign(n));

    }

    public static int sign(int n) {
        //your code here
if(n>0){
   return 1;
} else if (n<0) {

    return -1;
}
else

    return 0;
    }//end sign

}

//A sign function is simple, its gets a number and tells you if its positive, negative or zero.
//
//for example :
//
//sign(5)  => 1
//
//sign(-30)=> -1
//
//sign(0)  => 0
//
//sign gets an int parameter.
//
//print out 1,-1 or 0 depending on the input
