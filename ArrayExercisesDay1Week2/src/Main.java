package src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*
        ----------------------(Question One)------------------------
            1.Write a Java program to test if the first and the last element of an array of
            integers is same. The length of the array must be greater than or equal to
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
        ----------------------(Question Two)------------------------
        Write a Java program to find the numbers greater than the average of the
        numbers of a given array.

        ---------------------( Solution) --------------------------
        double []fixedNumbers = {1, 4, 17, 7, 25, 3, 100 };

        ArrayList <Double> numbers = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        double user = 1;
        //fill the array list from user
        while(user != 0 ){
            System.out.println("Enter the number , to close press 0 ");
            user = in.nextInt();
            if(user == 0 ){
                break;
            }
            numbers.add(user);
        }
        //calculate the sum and avg
        double sum = 0  , avg = 0 ;

        for(double number : fixedNumbers){
            sum += number;
        }
        avg = sum / fixedNumbers.length;

        //calculate the numbers greater than avg
        System.out.print("Numbers greater than avg : ");
        for (double number : numbers) {
            if(number > avg){
                System.out.print(number + "  ");
            }
        }
         */

        /*
        ----------------------(Question Three)------------------------
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
            ArrayList <Integer> originalNumbers = new ArrayList<>();
        // I suppose that the user will Enter numbers until he Entered 0 then the program will End .

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

        int []swapArrayNumbers = new int[originalNumbers.size()];
        swapArrayNumbers[0] = lastIndexValue;
        swapArrayNumbers[originalNumbers.size() - 1] = firstIndexValue;

        for (int i = 1; i <= originalNumbers.size() - 2; i++) {
            swapArrayNumbers[i] = originalNumbers.set(i , originalNumbers.get(i));
        }
        System.out.print("After swapping : ");
        System.out.println(Arrays.toString(swapArrayNumbers));
         */

        /*
        ----------------------(Question Five)------------------------
            Write a program that places the odd elements of an array before the
            even elements
        ---------------------( Solution) --------------------------
            int []numbers = {2, 3, 40, 1, 5, 9, 4, 10, 7} ;
        ArrayList<Integer> listOddThenEvenNumbers = new ArrayList<>();

        for(int number : numbers) {
            if(number % 2 == 1) {
                listOddThenEvenNumbers.add(number);
            }
        }
        for(int number : numbers) {
            if(number % 2 == 0) {
                listOddThenEvenNumbers.add(number);
            }
        }
        System.out.println(listOddThenEvenNumbers);
         */

        /*
        ----------------------(Question Sex)------------------------
        Write a program that test the equality of two arrays.

        ---------------------( Solution) --------------------------
         int []numbers1 = {2, 3, 6, 5, 4};
        int []numbers2 = {2, 3, 6, 6, 4};
        boolean equality = false;
        for (int i = 0; i < numbers1.length; i++) {
            if(numbers1[i] != numbers2[i]){
                equality = false;
                break;
            }else{
                equality = true;
            }
        }
        System.out.println(equality ? "the Two arrays numbers are equal":"the Two arrays numbers are not equal");
         */

    }
}