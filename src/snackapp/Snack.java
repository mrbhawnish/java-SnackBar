package snackapp;

/**
 * The class represents a snack item found in a vending machine
 */

public class Snack {
    
    //some changes
    // keep track of the last assigned id (int)

    private static int maxId = 0;
     
    // Assign a snack an id
    private int id;

    // The name (String) of the snack
    private String name;

    // The quantity available for the snack
    private int quantity;

    // The unit cost (double) of this snack
    private double cost;

    
    private int machineId;

    public Snack(String name, int quantity, double cost, int machineId)
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



    public int getMachineId()
    {
        return machineId;
    }


    public void setMachineId(int machineId)
    {
        this.machineId = machineId;
    }
    

    public int getQuantity() 
    {
        return quantity;
    }


    public void setQuantity(int quantity)
    {
        this.quantity += quantity;
    }


    public void buySnack(int amount) 
    {
        this.quantity -= amount;
    }
  
    // Returns the total cost of the given amount of snacks

    public double getTotalCost(int amount)
    {
       double totalCost = this.cost * amount;
       return totalCost;
    }

}
