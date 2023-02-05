import java.util.Scanner;

public class InvoiceApp {

/*
 Description: Invoice App that calculates the discount amount of line items inputted by the user
 Programmer: Owen Herrera
 Date: 2023.01.27
 GitHub: https://github.com/owenherrera0326/CSC160_JavaProjects.git
 */
    public static void main(String[] args) {
     
        // create a Scanner object named sc
        Scanner sc = new Scanner(System.in);
        
        // initialize variables for use in calculating averages
        int invoiceCount = 0;
        int numLineItems = 0;
        
        double invoiceTotal = 0.0;
        double discountTotal = 0.0;
        double subtotal = 0.0;
        double discountPercent = 0.0; 
        double discountAmount = 0.0;
        double invoiceDiscountTotal = 0.0;
        
        String choice = "y";
        String message = "?";
        
        // welcome the user to the program
        System.out.println("=======================================");
        System.out.println("Welcome to the Invoice Total Calculator");
        System.out.println("=======================================");
        System.out.println();  // print a blank line

        // perform invoice calculations until choice is "n" or "N"
        while (!choice.equalsIgnoreCase("n")) {
            // Gets the number of line items from the user
            System.out.print("Enter the number of line items:   ");
            numLineItems = sc.nextInt();
            System.out.println();
            System.out.println("=======================================");
            System.out.println();

            for (int i = 1; i <=numLineItems; i++) {
            	System.out.print("Enter #" + i + " line item amount:   ");
            	subtotal += sc.nextDouble();
            }
            
            System.out.println();
            System.out.println("=======================================");
            System.out.println();
            
            // calculate the discount amount and total
            if (subtotal >= 500) {
                discountPercent = .25;
            } else if (subtotal >= 200) {
                discountPercent = .2;
            } else if (subtotal >= 100) {
                discountPercent = .1;
            } else {
                discountPercent = 0.0;
            }
            discountAmount = subtotal * discountPercent;
            invoiceDiscountTotal = subtotal - discountAmount;
            
            // accumulate the invoice count and invoice total
            invoiceTotal = invoiceTotal + invoiceDiscountTotal;
            discountTotal = discountTotal + discountAmount;
            invoiceCount = invoiceCount + 1;  
            
            /* Better to do with printf  
            // display the discount amount and total
            message = "Discount percent: " + discountPercent + "\n"
                           + "Discount amount:  " + discountAmount + "\n"
                           + "Invoice total:    " + invoiceDiscountTotal + "\n";            
            System.out.println(message);
            */
            
            System.out.printf("%20s: %10.2f\n", "Subtotal", subtotal);
            System.out.printf("%20s: %10.2f\n", "Discount percent: ", discountPercent);
            System.out.printf("%20s: %10.2f\n", "Discount amount: ", discountAmount);
            System.out.printf("%20s: %10.2f\n", "Invoice total: ", invoiceDiscountTotal);
            
            
           
            System.out.println("=======================================");
            System.out.println();
            
            sc.nextLine(); //clears the input buffer of leftover return characters

            // see if the user wants to continue
            System.out.print("Continue? (y/n): ");
            choice = sc.nextLine();
            
            System.out.println();
            System.out.println("=======================================");
            System.out.println();
        }
        
        /* Better to do with printf
        // calculate and display invoice count, average invoice, and average discount
        message = "Number of invoices: " + invoiceCount + "\n"
                       + "Average invoice:    " + invoiceTotal / invoiceCount + "\n"
                       + "Average discount:   " + discountTotal / invoiceCount + "\n";
        System.out.println(message);
        */
     
        
        System.out.println("=======================================");
        System.out.println();
        
        System.out.println("Goodbye for now");
        
        sc.close();
    } //end of main
} //end of InvoiceApp