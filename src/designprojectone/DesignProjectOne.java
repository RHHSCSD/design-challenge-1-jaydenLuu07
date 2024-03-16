/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package designprojectone;
import java.util.*;
import java.util.Scanner;
/***************************************************
*
*  Program: Tech Fair Cost Calculator
*  Author: Jayden Luu
*  Date: Doesn't matter
*  Description: Write a Java program to calculate the material cost for each
*               student participating in the science fair.
****************************************************/

/**************** IPO CHART ************************
*INPUT:
* Number of students who ordered the Arduino Project
* Number of students who ordered the Raspberry PI Project
* Number of students who ordered the VR Project
*
*PROCESSING:
* Calculate the total number of students
* Calculate whether or not the 5% discount applies
* Calculate the total price for the 3 projects
* Calculate the average cost between all students
*
*OUTPUT:
* Output the average cost of all students
*
***************************************************/

/**************** TEST CASES **************************************************************************
*Test      Input      Desired Ouput                             Actual Output
*       0,0,0           $0.0                                    $0.0
*       40,40,40        $61.17                                  $61.17
*       20,20,20        $64.67                                  $64.67 
*       15,15,15        $65.0                                   $65.0
*       12,63,-4        Don't input a negative number.          Don't input a negative number.
******************************************************************************************************/
public class DesignProjectOne {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   //Write Pseudocode FIRST as comments and THEN write the code
    /****************************************
    * PROGRAM Tech Fair Cost Calculator
    *   Read A as an integer
    *   Price is 15.00 (double)
    *   IF A is greater than 15,
    *       THEN price is 9.00 
    *   ENDIF
    *   Multiply price by A
    * 
    *   Read B as an integer
    *   Price is 15 (double)
    *   IF B is greater than 20
    *       THEN price is 12 (double)
    *   ENDIF
    *   Multiply price by B
    * 
    *   Read C as an integer
    *   Price is 20 (final double)
    *   Multiply price by C
    * 
    *   Add variable sums of A, B, and C
    *   
    *   Add A, B, and C together
    *   Fixed cost is 50.00 (double)
    *   Fixed cost sum is ABC sum multiplied by fixed cost
    *   Discount is 0.95 (double)
    *   IF sum is greater than 100
    *       THEN multiply discount by fixed cost sum
    *   ENDIF  
    * 
    *   Add fixed cost sum to variable sum
    *   Divide by sum of ABC
    *   Output result
    *
    *END
    *****************************************/
   
  //CODE
        Scanner keyboard = new Scanner(System.in);
        
        //Reading and calculating variable cost for the Arduino project
        System.out.print("How many students ordered the Arduino project? ");
        int arduinoStudents = keyboard.nextInt();
        if (arduinoStudents<0){
            System.out.println("Don't input a negative number.");
            System.exit(0);
        }
        double arduinoPriceRate = 10;
        if (arduinoStudents>15){
            arduinoPriceRate = 9;
        }
        double arduinoSum = arduinoStudents*arduinoPriceRate;
        
        //Reading and calculating variable cost for the Raspberry PI progect
        System.out.print("How many students ordered the Raspberry PI project? ");
        int raspberryStudents = keyboard.nextInt();
        if (raspberryStudents<0){
            System.out.println("Don't input a negative number.");
            System.exit(0);
        }
        int raspberryPriceRate = 15;
        if (raspberryStudents>20){
            raspberryPriceRate = 12;
        }
        int raspberrySum = raspberryStudents*raspberryPriceRate;
        
        //Reading and calculating variable cost for the VR project progect
        System.out.print("How many students ordered the VR project? ");
        int vrStudents = keyboard.nextInt();
        if (vrStudents<0){
            System.out.println("Don't input a negative number.");
            System.exit(0);
        }
        final int vrPriceRate = 20;
        int vrSum = vrStudents*vrPriceRate;
        
        //Adding the variable sum of all three projects
        double variableSum = arduinoSum+raspberrySum+vrSum;
        
        //Determine total fixed price
        int studentTotal = arduinoStudents+raspberryStudents+vrStudents;
        final double fixedRate = 50;
        final double fixedDiscount = 0.95;
        double fixedSum = studentTotal*fixedRate;
        if(studentTotal>100){
            fixedSum*=fixedDiscount;
        }
        
        //Determine total price and average price per student
        double totalSum = fixedSum+variableSum;
        double averageCost = Math.round((totalSum/studentTotal)*100.0)/100.0;
        System.out.print("The average cost is $"+averageCost);
        
        keyboard.close();
    }
}
