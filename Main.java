//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import javax.xml.namespace.QName;
import java.util.Scanner;

public class Main {


    // Execution method
    public static void main(String[] args) {


        // First World

        System.out.println("Hello, World!"); // Hellow world

        // 1:  Data Types and variables

        //Primitive
        int myNum = 5;
        double myDouble = 5.99;
        char myChar = 'D';
        boolean myBool = true;

        // non-primitive
        String myString = "My Name is Hossein";


        //  Arrays ( as a data structure)

        //Single-dimensional array
        int[] myArray = {1, 2, 3, 4, 5};
        System.out.println(myArray[0]); // Output: 1

        // Multidimensional array
        int[][] my2DArray = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(my2DArray[1][2]); // Output: 6

        //  2: Operators

        // Arithmetic operators
        int sum = 5 + 3;
        int difference = 5 - 3;
        int product = 5 * 3;
        int quotient = 5 / 3;
        int remainder = 5 % 3;

        // Relational operators

        boolean isEqual = (5 == 3);
        boolean isNotEqual = (5 != 3);
        boolean isGreater = (5 > 3);

        boolean isLess = (5 < 3);

        // Logical operators

        boolean andOperator = (5 > 3 && 5 < 10);
        boolean orOperator = (5 > 3 || 5 > 10);
        boolean notOperator = !(5 > 3);

        // Assigment operator

        int x = 5;
        x += 3; // x = x + 3

        // 3. Control Flow Statements


        // if-else statement
        int number = 20;
        if (number > 0) {
            System.out.println("Positive number");
        } else {
            System.out.println("Negative number");
        }

        // switch statement
        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Other day");
        }

        // for loop
        for (int i = 0; i < 3; i++) {
            System.out.println("For " + i);
        }



        // while loop
        int i = 0;
        while (i < 3) {
            System.out.println("While " + i);
            i++;
        }


        // do-while loop
        int j = 0;
        do {
            System.out.println("Do while " + j);
            j++;
        } while (j < 3);


        System.out.println("Calling methods (see the bellow part) " );
        // Calling methods (see the above part)


        int newvariable = addNumbers(10,20,30);
        System.out.println("Adding" + newvariable);


        int K = 20;
        inspectVariable("K", K);// i is defined above

        arrayprinter(10);


        Inputtaker();





    }


////////////// 4: methods development

    // Method 1
    public static int addNumbers(int a, int b) {
        return a + b;
    }


    //Method 2 (overloading on method 1)
    public static int addNumbers(int a, int b, int c) {
        return a + b + c;
    }


    // Method 3 inspecting the variable types

    public static void inspectVariable(String varName, Object varValue) {
        System.out.println("Variable Name: " + varName);
        System.out.println("Type: " + varValue.getClass().getSimpleName());
        System.out.println("Value: " + varValue);
        System.out.println("----------------------------");
    }


    // Method 4 for making an array

    public static void arrayprinter(int N){
        int[]array = new int [N];

        for(int i = 0; i < array.length; i++){
            array[i] = i + 1;
        }

        for ( int i = 0; i < array.length; i++) {
            //Inner loop to print numbers up to the current value of i
            for ( int j = 0; j <= i; j++) {
                System.out.print(array[j] + " ");
            }
            // Move to the next line after printing the numbers for the current i
            System.out.println();

        }


    }


    // Method 5 for showing variable types

    public static void Inputtaker(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        double sum = num1 + num2;
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
        scanner.close();

    }


}









