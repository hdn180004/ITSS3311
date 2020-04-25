import java.util.Arrays;
import static java.lang.System.*;
import java.util.Scanner;

/*Enter 5 elements of list1:1
        2
        3
        4
        5
        Enter 5 elements of list2:1
        2
        3
        4
        5
        Two list are strictly identical.
*/
    public class Equality {
    // Equality method that checks if two arrays are identical.
        public static boolean equals(int[] array1, int[] array2){
            if(Arrays.equals(array1,array2)){
                return true;
            }
            return false;
    }

    public static void main(String args[]){
        //Creating Scanner Object
        Scanner input = new Scanner(System.in);
        //Creating list1 with 5 integers.
        int[] list1 = new int[5];
        //Prompting user to put in 5 integers to list1
        out.print("Enter 5 elements of list1: ");
        //Loop to assign the user input to the values in the array
        for(int i = 0; i<list1.length;i++){
            list1[i] = input.nextInt();
        }

        //Creating list2 of 5 integers.
        int[] list2 = new int[5];
        //Prompting user to put in 5 integers to list2
        out.print("Enter 5 elements of list2: ");
        //Assigning user's input to the values in list2 array.
        for(int i = 0; i<list2.length;i++){
            list2[i] = input.nextInt();
        }
        //Checking if the two arrays are strictly identical and printing out the result.
        if(equals(list1,list2)){
            out.println("Two list are strictly identical.");
        }
        else {
            out.println("Two list are not strictly identical.");
        }
    }


}