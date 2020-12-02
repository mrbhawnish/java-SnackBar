package snackapp;

public class VendingMachine {
    // keep track of the last used vending machine
    private static int maxId = 0;


    private int id;
    private String name;

    //Constructor for this vending machine. Given a name, this sets the initial state of a machine object

    public VendingMachine(String name)
    {
        maxId++;
        id = maxId;
        this.name = name;
    }
    // methods
    // get vending machine Id
    public int getId(){
        return id;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }


}
