package snackapp;

public class Customer {

    // keep track of the last used customerId
    private static int maxId = 0;

    private int id;
    private String name;
    private double cash;


    // Constructor for a customer. Creates a new customer given the name and cash on hand. 
    // get customer id
    // add two params and assign it to the Constructor

    public Customer(String name, double cash)
    {
        maxId++;
        id = maxId;
        this.name = name;
        this.cash = cash;
    

    }
    public int getId()
    {
        return id;
    }
    // set customer's name
    public void setName(String name)
    {
        this.name = name;
    }



    public String getName()
    {
        return name;
    }

    public double getCash()
    {
        return cash;
    }
    // add cash to the cash on hand

    public void addCash(double amount)
    {
         this.cash = this.cash  + amount;
    }
 

    //Buy snack given the total cost of the snacks to be purchased,
    //reduce the cash on hand by that amount

    public void buySnacks(double amount)
    {
        this.cash -= amount;
    }
   
}

