package com.hackerrank.challenges.dayFive;

import java.util.Scanner;

public class DayFiveMain {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
//        System.out.println("GOD is good!");
        int n = scanner.nextInt();


        for (int i=1; i<=10; i++){
            int result = n *i;
            System.out.println(n+" x "+i+" = "+result);
        }




        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();
    }
}

//TODO
// >Objective:
// In this challenge, we're going to use loops to help us do some simple math. Check out the Tutorial tab to learn more.
// >TASK:
// Given an integer, n, print its first 10 multiples. Each multiple n * i (where 1<=i<=10) should be printed on a new line in the
// form: n * i = result.
// >Input Format
//    A single integer, n.
// Constraints
//  2 <= n <= 20
// >Output Format
//    Print  lines of output; each line  (where ) contains the  of  in the form:
//        n x i = result.
// >Sample Input
// ...
// 2
// >Sample Output
// ...
// 2 x 1 = 2
// 2 x 2 = 4
// 2 x 3 = 6
// 2 x 4 = 8
// 2 x 5 = 10
// 2 x 6 = 12
// 2 x 7 = 14
// 2 x 8 = 16
// 2 x 9 = 18
// 2 x 10 = 20