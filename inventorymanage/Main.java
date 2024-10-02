import java.util.*;

public class Main 
{
    public static void main(String[] args)
    { 
        Inventory inventory = new Inventory();
        PerishableProduct apple = new PerishableProduct("P001", "Apple", 50, 0.5, "2024-12-31");
        inventory.addProduct(apple);
        NonPerishableProduct rice = new NonPerishableProduct("NP001", "Rice", 200, 1.0, 365);
        inventory.addProduct(rice);

        inventory.inventoryDisplay();

        try {
            apple.updateStock(30);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            apple.updateStock(30);  
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            inventory.removeProduct("P001");
        } catch (InsufficientStockException e) {
            System.out.println(e.getMessage());
        }
        try {
            apple.updateStock(-60);  
        } catch (InsufficientStockException e) {
            System.out.println(e.getMessage());
        } catch (InvalidQuantityException e) {
            System.out.println(e.getMessage());
        }
        try {
            apple.updateStock(-10);  
        } catch (InvalidQuantityException e) {
            System.out.println(e.getMessage());
        } catch (InsufficientStockException e) {
            System.out.println(e.getMessage());
        }
    }
}


// Encapsulation
class Product 
{
   private String productID;
   private String productName;
   private int quantity;
   private double price;

   public Product(String productId, String productName, int quantity, double price) 
    {
        this.productID = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }
   
   public String getProdID(){return productID;}
   public String getProdName(){return productName;}
   public int getProdQuantity(){return quantity;}
   public double getProdPrice(){return price;}
   
   public void setProdID(String prodId){this.productID = prodId;}
   public void setProdName(String prodName){this.productName = prodName;}
   public void setQuantity(int quanti){this.quantity = quanti;}
   public void setPrice(double prodPrice){this.price = prodPrice;}
   
   public void displayProductInfo()
    {
        System.out.println("Product: " + getProdName() + ", Quantity: " + getProdQuantity() + ", Price: $" + getProdPrice());
    }
}

// Subclasses with Inheritance
class PerishableProduct extends Product 
{
   private String expirationDate;
   private final int maxQuantity = 100;
   
   public PerishableProduct(String productId, String Productname, int Quantity, double Price, String expireDate) 
   {
      super(productId, Productname, Quantity, Price);
      this.expirationDate = expireDate;
   }  

   public void updateStock(int amount) throws InsufficientStockException, InvalidQuantityException
   {
        if (amount < 0 && amount + getProdQuantity() + amount < 0  )
        {
            throw new InsufficientStockException(getProdName() + "\n"); 
        } 
        else if (amount + getProdQuantity() > maxQuantity)
        {
            throw new InvalidQuantityException("Amount cannot exceed maximum quantity = 100");
        }
        else if ( amount < 0)
        {
            throw new InsufficientStockException("Amount cannot be less than zero or negative");
        }
        else
        { 
            setQuantity(getProdQuantity() + amount);
            System.out.println("\nName of Stock: " + getProdName() + "\n" + "Updated Quantity: " + getProdQuantity());
        }
   }    
}

class NonPerishableProduct extends Product 
{
   private int shelfLife;
   private final int maxQuantity = 100;
   
   public NonPerishableProduct(String productId, String Productname, int Quantity, double Price, int shelf) 
   {
        super(productId, Productname, Quantity, Price);
        this.shelfLife = shelf;
   }  
   public int getshelfLife()
   {
        return shelfLife;
   }

   public void updateStock(int amount) throws InsufficientStockException, InvalidQuantityException
   {
        if (amount < 0 && amount + getProdQuantity() + amount < 0  )
        {
            throw new InsufficientStockException(getProdName()+ "\n"); 
        } 
        else if ( amount < 0)
        {
            throw new InvalidQuantityException("\nAmount cannot be less than zero or negative" );
        }
        else
        { 
            setQuantity(getProdQuantity() + amount);
            System.out.println("\nName of Stock " + getProdName() + "\n" + "Updated Quantity: " + getProdQuantity());
        }
   }
}

// Abstraction
abstract class InventoryOperation 
{  
   public abstract void addProduct(Product product);
   public abstract void removeProduct(String productId) throws InsufficientStockException;
}

class Inventory extends InventoryOperation
{
    private List<Product> products;

    public Inventory()
    {
        products = new ArrayList<>();
    }

    @Override
    public void addProduct(Product product)
    {
        products.add(product);
        System.out.print("Product added: " + product.getProdName() + "\n" +"Quantity: " + product.getProdQuantity()+ "\n");
    }
    @Override
    public void removeProduct(String productId) throws InsufficientStockException 
    {
        Product productRemove = null;
        for (Product product : products)
        {
            if (product.getProdID().equals(productId))
            {
                productRemove = product;
                break;
            }
        }
        if (productRemove != null)
        {
            products.remove(productRemove);
            System.out.println("Product Removed Successfully");
        }
        else
        {
            throw new InsufficientStockException("Product with " + productId + "Removed Successfully");
        }
    }
    public void inventoryDisplay()
    {
        if (products.isEmpty())
        {
            System.out.println("Empty Inventory");
        }
        else
        {
            for (Product product : products)
            {
                product.displayProductInfo();
            }
        }
    }
}

// Exception Handling
class InsufficientStockException extends Exception
{
    public InsufficientStockException (String msg)
    {
        super("Insufficient Stock for " + msg);
    }
}
class InvalidQuantityException extends Exception
{
    public InvalidQuantityException(String msg)
    {
        super(msg);
    }
}
