/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fizzbuzz;

/**
 *
 * @author Alex Baker
 * @class AP CSA
 */
public class FizzBuzz {
    
    /*
    My code checks if a number less than 101 is divisible by 15, if so it prints FizzBuzz.
    If not, it checks to see if it is divisible by 3 and prints Fizz if it is.
    If not, it checks modulus 5 and prints Buzz if it is correct.
    */

    public static void main(String[] args) 
    {
        for(int i = 1; i < 101; i++)
        {
            if(i % 15 == 0)
            {
                System.out.println("FizzBuzz");
            }
            else if(i % 3 == 0)
            {
                System.out.println("Fizz");
            }
            else if(i % 5 == 0)
            {
                System.out.println("Buzz");
            }
            else
            {
                System.out.println(i);
            }
        }
    }
    
}
