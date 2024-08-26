/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cen4802cassignment1;

/**
 *
 * @author robianalabady
 */
public class CEN4802CAssignment1 {

    //add-javadoc-comments
    //**
     * Recursive method to find the nth Fibonacci number.
     *
     * @param n the position in the Fibonacci sequence
     * @return the nth Fibonacci number
     */

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        int n = 10;
        int result = fibonacci(n);
        System.out.println("The " + n + "th term of the Fibonacci sequence is " + result + ".");
    }//end main
    

}//end CEN4802CAssignment1
