package com.mycompany.csc229_211review_lab02hw;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * DriverClass Class</p>
 * DATE: 09/14/2025</p>
 * @author MoaathAlrajab
 * @author Ronald
 */
public class DriverClass {

    public static void main(String[] args) {

        // ToDo 5: Fix the error ■
        // ToDo 6: Fix the constructor of Student class ■
        // ToDo 7: Add a toString method for Student class ■

        Student std1= new Student("James", (short)20);

        // ToDo 8: Set the gpa of the student using the scanner and user
        // 			input and then print the output. ■

        System.out.println("enter a grade point average:");
        Scanner scan = new Scanner(System.in);

        while(true) {
            try {
                std1.setGrade(scan.nextDouble());
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input");
                scan.next();
            } catch (Exception e ) {
                System.out.println(e);
            }
        }
        System.out.println(std1);

        // ToDo 9: add comments and explain your code ■
        /*
        super, 'Person', doesn't instantiate instance variable 'address', nor
        does it define its address getters and setters. Concerning this declared but uninstantiated
        and inaccessible instance variable, I thought of 4 options:

        1) make a new 'address' variable for class 'Student'
        2) change the access modifier of Persons address to protected (questionably allowed, insecure)
        3) define redundant, getters and setters for a Student's address
        and pretend 'address' doesn't exist
        4) define a conventional Person Constructor (not allowed, two params specified)

        I went with option 3... but left comments for if I had chosen option 1.

        I also exception handled GPA inputs.
         */

        scan.close();
        // ToDo 10: submit using a pull request. ■
    }

}