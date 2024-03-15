package com.perscholas.java_basics;

public class Main {
    public static void main(String[] args) {
        //Write a program that declares two integer variables, assigns an integer to each,
        // and adds them together. Assign the sum to a variable. Print out the result.
        int first   = 2 ;
        int second  = 4 ;
        int sum     = first + second ;
        System.out.println(sum);

        //Write a program that declares two double variables, assigns a number to each,
        // and adds them together. Assign the sum to a variable. Print out the result.

        double firstDouble  = 2.5 ;
        double secondDouble = 1.8 ;
        double doubleSum    = firstDouble + secondDouble ;
        System.out.println(doubleSum);

        //Write a program that declares an integer variable and a double variable,
        // assigns numbers to each, and adds them together.
        // Assign the sum to a variable. Print out the result. What variable type must the sum be?

        int secondInt       = 5;
        double thirdDouble  = 2.5 ;
        double thirdSum     = secondInt + thirdDouble ;
        System.out.println(thirdSum);

        //Write a program that declares two integer variables, assigns an integer to each,
        // and divides the larger number by the smaller number. Assign the result to a variable.
        // Print out the result.
        // Now change the larger number to a decimal. What happens? What corrections are needed?

        int thirdInt    = 5 ;
        int fourthInt   = 25;
        int division    = fourthInt / thirdInt ;
        System.out.println( division);
        // when larger number was changed to decimal, error was shown so it need to be changed
        // to something like "double" type
        double largerNumber     = 25.0 ;
        double finalDivision   = largerNumber/thirdInt ;
        System.out.println(finalDivision);


        // Write a program that declares two double variables, assigns a number to each,
        // and divides the larger by the smaller number. Assign the result to a variable.
        // Print out the result. Now, cast the result to an integer. Print out the result again.

        double fourthDouble          = 5.8 ;
        double fifthDouble           = 2.5 ;
        double fourthFifthDivision   =  ( fourthDouble/ fifthDouble);
        System.out.println(fourthFifthDivision);
        //  casting the result to an integer and printing
        System.out.println((int) fourthFifthDivision);

        // Write a program that declares two integer variables, x and y, and assigns the number 5 to x and the number 6 to y.
        // Declare a variable q and assign y/x to it and print q.
        // Now, cast y to a double and assign it to q. Print q again.

        int x = 5;
        int y = 6;
        double q = y / x ;
        System.out.println(q);
        // casting y to double and assigning it to q and printing at last.
        q = (double) y;
        System.out.println(q);

        // Write a program that declares a named constant and uses it in a calculation. Print the result.

        final double PI = 3.14 ;
        final int radius = 2 ;

        double area = PI * radius * radius;

        System.out.println(area);


        //Write a program where you create three variables that represent products at a cafe.
        // The products could be beverages like coffee, cappuccino, espresso, green tea, etc.
        // Assign prices to each product. Create two more variables called subtotal and totalSale
        // and complete an “order” for three items of the first product, four items of the second product,
        // and two items of the third product. Add them all together to calculate the subtotal.
        // Create a constant called SALES_TAX and add sales tax to the subtotal to obtain the totalSale amount.
        // Be sure to format the results to two decimal places.

        double coffee           = 4.5;
        double expresso         = 6.35;
        double latte            = 5.45;
        final double SALES_TAX  = 9.5 ;
        double subtotal         = 0.0;
        double totalSale        = 0.0;

        double newCustomerOrder = 3 * coffee + 4 * expresso + 2 * latte ;
        // subtotal before the sales tax
        subtotal                = newCustomerOrder ;
        System.out.println(subtotal);

        // calculating the tax
        double totalTaxForOrder = subtotal * SALES_TAX / 100 ;
        // total with tax
        totalSale = totalTaxForOrder + subtotal ;
        // formatting the result to two decimal places
        System.out.printf("%.2f", totalSale);

    }
}