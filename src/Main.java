import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*-------------------------------------NUMBER 1--------------------------------------*/

        // Creating an array call ages, subtracting first and last element without the use of numbers

        int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};

        int array = ages.length;

        int result = ages[array - array] - ages[array - 1];

        System.out.println("First - Last Element in ages = " + Math.abs(result));

        // Creating an Dynamic ArrayList to add another element then subtracting first to new last element.

        List<Integer> newAges = new ArrayList<Integer>();

        newAges.add(3);
        newAges.add(9);
        newAges.add(23);
        newAges.add(64);
        newAges.add(2);
        newAges.add(8);
        newAges.add(28);
        newAges.add(93);
        newAges.add(75);

        System.out.println("List of all elements including new age = " + newAges);

        int first = newAges.get(0);

        int last = newAges.get(newAges.size() - 1);

        System.out.println("First - Last Element in new ages = " + Math.abs(first - last));

        // Using a for loop to get the average of new ages

        int sum = 0;

        for (int i : newAges) {
            sum += i;
        }
        int average = sum / newAges.size();

        System.out.println("The average of new ages is = " + average);

        /*-------------------------------------NUMBER 2--------------------------------------*/

        // Create a String array and loop for the average
        String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};

        int sum2 = 0;

        for (int i = 0; i < names.length; i++) {
            sum2 += names[i].length();
        }

        System.out.println("Average number of letters per name = " + sum2 / names.length);

        String allNames = "";

        for (int i = 0; i < names.length; i++) {
            allNames += names[i] + " ";
        }

        System.out.println("List of all the names = " + allNames);

        /*-------------------------------------NUMBER 3--------------------------------------*/

        // How do you access the last element of any array?
        System.out.println("Access last element of any array by using = array[arr.length -1];");
        System.out.println("If ArrayList use = array.get(arr.size() -1);");

        /*-------------------------------------NUMBER 4--------------------------------------*/

        // How do you access the first element of any array?
        System.out.println("Access first element of any array by using = array[0];");
        System.out.println("If ArrayList use = array.get(0);");

        /*-------------------------------------NUMBER 5--------------------------------------*/

        int[] nameLengths = new int[names.length];

        for (int i = 0; i < names.length; i++) {
            nameLengths[i] = names[i].length();
        }

        /*-------------------------------------NUMBER 6--------------------------------------*/

        int sum3 = 0;

        for (int i = 0; i < nameLengths.length; i++) {
            sum3 += nameLengths[i];
        }

        System.out.println("Sum of all lengths in nameLengths = " + sum3);

        /*-------------------------------------NUMBER 7--------------------------------------*/

        // Method that takes a String and concatenate itself a number of times
        System.out.println(num7Method("Hello", 3));

        /*-------------------------------------NUMBER 8--------------------------------------*/

        // Method that takes two Strings and returns a full name
        System.out.println(num8Method("John", "Smith"));

        /*-------------------------------------NUMBER 9--------------------------------------*/

        // Method that takes an array and returns true if sum of all int is greater than 100
        int[] arrayNum9 = {23, 65, 45, 21, 30};

        System.out.println("Array sum is greater than 100 = " + num9Method(arrayNum9));

        /*-------------------------------------NUMBER 10--------------------------------------*/

        // Method that takes an array of double and returns the average
        double[] arrayNum10 = {23.43, 11.22, 62.00};

        System.out.println("Average of all the elements in the array = " + num10Method(arrayNum10));

        /*-------------------------------------NUMBER 11--------------------------------------*/

        // Method that takes two arrays of double and return true if first array elements average is greater
        double[] arrayNum11 = {12.22, 21.36, 32.85};

        System.out.println("Sum of the first array is greater than the second = " + num11Method(arrayNum10, arrayNum11));

        /*-------------------------------------NUMBER 12--------------------------------------*/

        // Method that return true if it is hot outside and if moneyInPocket is greater than 10.50
        System.out.println("I have enough for a $10.50 drink in this hot day = " + willBuyDrink());

        System.out.println("");
        /*-------------------------------------NUMBER 13--------------------------------------*/

        userInput();

        /*
        My method calls for the user to enter the length and the elements they want afterwards presenting an array.
        I choose to create this to show that we can add user input in a method while creating an array.
        */

    } // Class

    /*-----------------------------------------METHODS---------------------------------------*/

    public static String num7Method(String word, int n) {
        return word.repeat(n);
    }

    public static String num8Method(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    public static Boolean num9Method(int[] arrayNum9) {
        return Arrays.stream(arrayNum9).sum() > 100;
    }

    public static Double num10Method(double[] arrayNum10) {
        return Arrays.stream(arrayNum10).average().orElse(Double.NaN);
    }

    public static Boolean num11Method(double[] firstArray, double[] secondArray) {
        return num10Method(firstArray) > num10Method(secondArray);
    }

    public static Boolean willBuyDrink() { // Method for Number 12
        boolean isHotOutside = true;
        double moneyInPocket = 50.00;

        if (moneyInPocket > 10.50 && isHotOutside) {
            return true;
        }
        return false;
    }
    /*-------------------------------------MY OWN METHOD-------------------------------------*/

    public static String userInput() {

        System.out.println("Let's create an array!");

        System.out.println("");

        Scanner s = new Scanner(System.in);

        System.out.println("Enter the length of the array:");

        int length = s.nextInt();

        int[] myArray = new int[length];

        System.out.println("Enter the number you want in each of your elements:");

        for (int i = 0; i < length; i++) {
            myArray[i] = s.nextInt();
        }
        System.out.println(Arrays.toString(myArray));

        return userInput();
    }
} // Main




