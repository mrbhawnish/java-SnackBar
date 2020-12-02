package snackapp;

import java.text.DecimalFormat;

public class Main {
    

    //Private class field that sets the decimal format to $1,234.56

    private static DecimalFormat df = new DecimalFormat("$#,##0.00");


    //This is the main method, the starting point for this application

    public static void main(String[] args)

    {
        //SET UP TWO CUSTOMERS:

        Customer c1 = new Customer("Jane", 45.25);
        Customer c2 = new Customer("Bob", 33.14);


        //SET UP 3 VENDINGMACHINES:

        VendingMachine v1 = new VendingMachine("Food");
        VendingMachine v2 = new VendingMachine("Drink");
        VendingMachine v3 = new VendingMachine("Office");


        // SET UP 5 SNACKS
        Snack s1 = new Snack("Chips",36, 1.75, v1.getId());
        Snack s2 = new Snack("Chocolate Bar", 36, 1.00, v1.getId());
        Snack s3 = new Snack("Pretzel", 30, 2.00, v1.getId());
        Snack s4 = new Snack("Soda", 24, 2.50, v2.getId());
        Snack s5 = new Snack("Water",20, 2.75, v2.getId());

          // Customer 1 (Jane) buys 3 of snack 4 (Soda).
        // (hint: figure out cost of 3 snack 4s - Customer 1 spends that amount, Snack 4 loses 3 quantity).
        // Print Customer 1 (Jane) Cash on hand.
        // Print quantity of snack 4 (Soda).
        c1.buySnacks(s4.getTotalCost(3));
        s4.buySnack(3);
        System.out.println("Jane cash on hand " + df.format(c1.getCash()));
        System.out.println("Quantity of Soda " + s4.getQuantity());
        System.out.println();

        // Customer 1 (Jane) buys 1 of snack 3 (Pretzel).
        // Print Customer 1 (Jane) Cash on hand.
        // Print quantity of snack 3 (Pretzel).
        c1.buySnacks(s3.getTotalCost(1));
        s3.buySnack(1);
        System.out.println("Jane cash on hand " + df.format(c1.getCash()));
        System.out.println("Quanity of snack 3 is " + s3.getQuantity());
        System.out.println();

        /** Customer 2 (Bob) buys 2 of snack 4 (Soda).
        Print Customer 2 (Bob) Cash on Hand.
        Print quantity of snack 4 (Soda).  **/

        c2.buySnacks(s4.getTotalCost(2));
        s4.buySnack(2);
        System.out.println("Bob cash on hand " + df.format(c2.getCash()));
        System.out.println("Quantity of Soda " + s4.getQuantity());
        System.out.println();


        /** Customer 1 (Jane) finds $10.
       Print Customer 1 (Jane) Cash on Hand. **/

       c1.addCash(10);
       System.out.println("Jane cash on hand " + df.format(c1.getCash()));
       System.out.println();
     /**   Customer 1 (Jane) buys 1 of snack 2 (Chocolate Bar).
       Print Customer 1 (Jane) Cash on Hand.
       Print quantity of snack 2 (Chocolate Bar). **/

       c1.buySnacks(s2.getTotalCost(1));
       s2.buySnack(1);
       System.out.println("Jane cash on hand " + df.format(c1.getCash()));
       System.out.println("Quantity of Chocolate Bar " + s2.getQuantity());
       System.out.println();

     /**   Add 12 more items to snack 3 (Pretzel).
 Print quantity of snack 3 (Pretzel). **/

        s3.setQuantity(12);
        System.out.println("Quantity of Pretzel " + s3.getQuantity());
        System.out.println();

      /**   Customer 2 (Bob) buys 3 of snack 3 (Pretzel).
        Print Customer 2 (Bob) Cash on hand.
        Print quantity of snack 3 (Pretzel). **/

        c2.buySnacks(s3.getTotalCost(3));
        s3.buySnack(3);
        System.out.println("Bob cash on hand " + c2.getCash());
        System.out.println("Quantity of Pretzel " + s3.getQuantity());
        System.out.println();
    }


}
