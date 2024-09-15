package org.example;            //Sept 2024 Arrays Basics oop-array-basics

import java.util.Arrays;

/**
 * Arrays are Objects in Java.
 * Arrays are FIXED length, and all elements must be of the same type (for a given array)
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Array Basics");

        System.out.println("\n\n\n");

        int[] grades = {52, 34, 45, 56};    // static initialization of an array with values
        System.out.println("grades array length/size =  " + grades.length + "\n");

        // can we simply print an array ?
        System.out.println("Grades:" + grades + "\n");   // Any issues?

        displayArray(grades);       // pass reference to grades array as argument

        double avg = calculateAverage(grades);

        System.out.println("Average = " + avg);

        String[] students = {"Tom", "Peter", "Jane", "Mary"};
        displayArray(students);

        System.out.println();
        System.out.println("grades using toString(): " + Arrays.toString(grades));
        System.out.println("students using toString(): " + Arrays.toString(students));

        Arrays.sort(grades);
        System.out.println("grades after sorting:" + Arrays.toString(grades));       //Any issues?
        Arrays.sort(students);
        System.out.println("students after sorting:" + Arrays.toString(students));
//
//      Todo: code the method reverseArray()
//        System.out.println();
//        reverseArray(grades);
//        System.out.println("grades after reverseArray():" + Arrays.toString(grades));
//        reverseArray(grades);
//        System.out.println("grades after reversal back to normal:" + Arrays.toString(grades));


    }

    // This method has one reference parameter - and array called numbers
    // It will receive a reference to an Array object, and can access the
    // array elements using the parameter name.
    //
    public static void displayArray(int[] numbers) {
        System.out.println("\nArray Contents and index:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(i + "\t" + numbers[i] + "\t");
        }
//        System.out.println("Array Contents using enhanced for loop:");
//        for(int number:numbers)
//        {
//            System.out.print(number + " ");
//        }

    }

    /*
     *  Overload method displayArray()
     *
     */
    public static void displayArray(String[] words) {
        System.out.println("\nArray Contents and index:");
        for (int i = 0; i < words.length; i++) {
            System.out.println(i + "\t" + words[i] + "\t");
        }
//        ToDo rewrite this code using enhanced for loop
    }


    public static double calculateAverage(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
//
//       //Alternatively:
//        for (int number : numbers)
//        {
//            sum += number;
//        }

        return (double) sum / numbers.length;  //cast to double to prevent integer division
    }
}



