public class countAppearance {

    public static void main(String[] args) {

        String[] arr = {"a","foo","bar","foo","bla"};
        String str = "foo";

        System.out.println(count_appearance(arr, str));

    }

    public static int  count_appearance(String[] arr,String t) {
        //Write Your Code Here
        int count = 0;
        for (int i=0; i<=arr.length-1; i++){
            if(arr[i].equalsIgnoreCase(t)){
                count ++;
            }
        }
        return count;
    } //end  count_appearance

}

//Create a method that gets an array of strings and a string, the method returns an int.
//
//It counts how many times a string appears in the array and returns the count.
//
//for example (pseudo code):
//
//array = ["a","foo","bar","foo","blabla","foo"]
//
//string = "foo"
//
//count_appearance(array, string) will return 3 because array has 3 appearances of "foo" string.
//
//Call this method from the main method, and print returned result from the main method.
