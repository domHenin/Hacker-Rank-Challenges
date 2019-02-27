package com.hackerrank.challenges.daySix;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class DaySixMain {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */


        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        String string[] = new String[T];
        for(int i = 0; i<T; i++){
            string[i] = scan.next();
        }
        for(int temp = 0; temp<T; temp++){

            for(int j = 0; j<string[temp].length(); j = j+2)
            {
                System.out.print(string[temp].charAt(j));
            }
            System.out.print(" ");

            for(int j = 1; j<string[temp].length(); j = j+2){
                System.out.print(string[temp].charAt(j));
            }

            System.out.println();

        }
        scan.close();

//        Scanner scan = new Scanner(System.in);
//        int T = scan.nextInt();
//        String s;
//
//        for(int i=0;i<T;i++){
//            s = scan.next();
//
//            for(int j=0;j<s.length();j++){
//
//                if(j%2 ==0){
//                    System.out.print(s.charAt(j));
//                }
//            }
//            System.out.print(" ");
//            for(int j=0;j<s.length();j++){
//                if(j%2==1){
//                    System.out.print(s.charAt(j));
//                }
//
//            }
//            System.out.println();
//        }

//        for(int i = new Scanner(System.in).nextInt(); i > 0; i--) {
//            String[] s = {new Scanner(System.in).nextLine(), "", ""};
//            for(int j = 0; j < s[0].length(); j++) {
//                if(j % 2 == 0) s[1] += s[0].charAt(j);
//                else s[2] += s[0].charAt(j); }
//            System.out.println(s[1] + " " + s[2]); }

//        String var = scanner.nextLine();
//        int T = scanner.nextInt();
//
//
//        for (int i=0; i< var.length(); i++) {
//
//        }


//        Scanner scanner = new Scanner(System.in);
//
//        String myString;
//        int N;
//
//        myString = scanner.nextLine();
//
//        char[] myCharArray = myString.toCharArray();
//        for (int i=0; i<myString.length(); i++) {
//            System.out.print((int)myCharArray[i]);
//        }

        //example of 'breaking' a string down

//        String aString = "This is String example.";
//        char[] charArray = aString.toCharArray();
//        for (int i=0; i< aString.length(); i++) {
//            //print each sequential character on the same line
//            System.out.print(charArray[i]);
//        }
//        System.out.println();
    }
}

//TODO
// >Objective:
// Today we're expanding our knowledge of Strings and combining it with what
// we've already learned about loops. Check out the Tutorial tab for learning
// materials and an instructional video!
// >Task:
//  >>Given a string, S, of length N that is indexed from 0 to N-1, print its even-indexed and odd-indexed characters
//  as 2 space-separated strings on a single line (see the Sample below for more detail).
// >Note: 0 is considered to be an even index.
// >Input Format
// >>The first line contains an integer, T (the number of test cases).
// Each line i of the T subsequent lines contain a String, S.
// Constraints:
// 1<= T <= 10
// 2<= length of S <= 10000
// >Output Format
// >> For each String S(j) (where 0 <= j <= T - 1), print S(j)'s even-indexed characters, followed by a space,
// followed by S(j)'s odd-indexed characters.
// Sample Input
// 2
// Hacker
// Rank
// Sample Output
// Hce akr
// Rn ak


