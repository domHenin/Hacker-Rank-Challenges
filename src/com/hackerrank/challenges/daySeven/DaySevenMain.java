package com.hackerrank.challenges.daySeven;

import java.util.Scanner;

public class DaySevenMain {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        System.out.println("i can do all things through CHRIST, who strengthens me!");
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];


        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = n-1; i >= 0; i--) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
            System.out.print(arr[i] + " ");
        }

        scanner.close();    }
}

//TODO
// >Objective:Today, we're learning about the Array data structure. Check out the Tutorial tab for learning materials and an instructional video!
// >Task
//  >>Given an array, A, of N integers, print A's elements in reverse order as a single line of space-separated numbers.
// >Input Format
// >>The first line contains an integer, N (the size of our array).
// >>The second line contains N space-separated integers describing array A's elements.
// >Output Format
// >>Print the elements of array  in reverse order as a single line of space-separated numbers.
// >Sample Input
//  4
//  1 4 3 2
// >Sample Output
//  2 3 4 1
