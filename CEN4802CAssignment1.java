/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cen4802cassignment1;

/**
 *
 * @author robianalabady
 */
public class CEN4802CAssignment1 {

    //Recursive method to find the nth number
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }//end if
        else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }//end else
    }

    public static void main(String[] args) {
        int n = 10; // Get the 10th Fibonacci number
        int result = fibonacci(n);
        System.out.println("The " + n + "th term of the Fibonacci sequence is " + result + ".");
    }//end main
    
}//end CEN4802CAssignment1