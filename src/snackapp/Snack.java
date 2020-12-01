package snackapp;

public class Snack {
    
    //some changes
    
    private static int maxId = 0;

    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int machineId;

    public Snack(int id, String name, int quantity, double cost, int machineId)
    {
        maxId++;
        id = maxId;

        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.machineId = machineId;

    }
    
    // getters and setters
    public int getId() 
    {
        return id;
    }

    public String getName() 
    {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getcost() 
    {
        return cost;
    }
    
    public void setCost(double cost) 
    {
        this.cost = cost;
    }

    //set and get name
    //set and get cost
    //set and get vending machine id
    //get quantity
    //add quantity when given how many to add
    //buy snack when given how many to buy
    //get total cost given a quantity
}
