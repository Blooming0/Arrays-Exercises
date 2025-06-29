import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*
        ----------------------(Qusetion One)------------------------
            1.Write a Java program to test if the first and the last element of an array of
            integers are same. The length of the array must be greater than or equal to
            2 Test Data:

        ---------------------( Solution) --------------------------
        int []numbers = {50, -20, 0, 30, 40, 60, 50};
        if(numbers[0] == numbers[ numbers.length - 1 ]){
            System.out.println("the last index value and the first index value is Equal to each Other");
        }else{
            System.out.println("it's not the same");
        }
         */
        /*
        ----------------------(Qusetion Two)------------------------
        Write a Java program to find the numbers greater than the average of the
        numbers of a given array.

        ---------------------( Solution) --------------------------

         */

        /*
        ----------------------(Qusetion Three)------------------------
        Write a Java program to get the larger value between first and last
        element of an array of integers.

        ---------------------( Solution) --------------------------
        System.out.println("Enter the size of the Array you want to add in : ");
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        System.out.println("Fill the Array ");
        int []numbers = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the number "+i+" : ");
            numbers[i] = in.nextInt();
        }
        if(numbers[0] == numbers[numbers.length - 1]){
            System.out.println("the 2 numbers are Equal");
        }else if(numbers[0] > numbers[size-1]){
            System.out.println("Larger value between first and last element : "+ numbers[0] );
        }else{
            System.out.println("Larger value between first and last element : "+ numbers[numbers.length-1] );
        }
         */

        /*
        ----------------------(Question Four)------------------------
        Write a Java program to swap the first and last elements of an array and
        create a new array.

        ---------------------( Solution) --------------------------

         */
        ArrayList <Integer> originalNumbers = new ArrayList<>();
        // I suppose that the user will Enter numbers until he Enterd 0 then the program will End .
        int i = 0 ;
        System.out.println("Fill the Array List with 2 numbers at least, to close the list Enter zero");
        Scanner in = new Scanner(System.in);
        int user = in.nextInt();
        originalNumbers.add(user);
        while(user != 0 ){
            System.out.println("Enter the number , to close press 0 ");
            user = in.nextInt();
            if(user == 0 ){
                break;
            }
            originalNumbers.add(user);

        }
        System.out.println("Array List Before Swapping : "+originalNumbers);
        int lastIndexValue = originalNumbers.getLast();
        int firstIndexValue = originalNumbers.getFirst();

        // I will fill the array list elements in the new normal array of integers.
        System.out.println(originalNumbers.size());
        System.out.println(originalNumbers.size()-1);

        int []swapingArray = new int[originalNumbers.size() - 1];

        /*
        ----------------------(Qusetion Five)------------------------


        ---------------------( Solution) --------------------------

         */
        /*
        ----------------------(Qusetion Sex)------------------------


        ---------------------( Solution) --------------------------

         */


    }
}