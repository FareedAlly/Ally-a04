package baseline;

public class Solution44
{
    private String input()
    {
        // Ask user what input they are searching for
        // Return answer
    }

    private Inventory readJSON()
    {
        // Read JSON by using BufferedReader?
        // Return inventory created
    }

    private boolean output(String search)
    {
        // If product is not in stock, print statement
        // If product is in stock, print information
    }

    public static void main(String[] args)
    {
        // Read JSON and store that to an inventory object
        // Search term user inputs and print result
    }
}

class Inventory
{
    private void product(String name, double price, int quantity)
    {
        // Sets information for each product
    }

    private Product search(String name)
    {
        // Use a loop to search all products in inventory based on name

    }


}

class Product
{
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity)
    {
        // Sets information for each product
    }

    public String getName()
    {
        return name;
    }

    public double getPrice()
    {
        return price;
    }

    public int getQuantity()
    {
        return quantity;
    }
}
