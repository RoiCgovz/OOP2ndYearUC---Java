abstract class InventoryOperation 
{  
   public abstract void addProduct(Product product);
   public abstract void removeProduct(String productId);
}
public class Product extends InventoryOperation 
{
   private String productID;
   private String productName;
   private int quantity;
   private double price;
   
   public setProdID(String prodId){this.productID = prodId;}
   public setProdName(String prodName){this.productName = prodName;}
   public setQuantity(String quanti){this.quantity = quanti;}
   public setPrice(String prodPrice){this.price = prodPrice;}
   
   public getProdID(){return productID;}
   public getProdName(){return productName;}
   public getProdQuantity(){return quantity;}
   public getProdPrice(){return price;}   
}
public class PerishableProduct extends Product 
{
   private String expirationDate;
   
   public PerishableProduct(String productId, String Productname, int Quantity, double Price, String expireDate) 
   {
      this.productId
   }  
   public void updateStock(int amount) 
   {
   }
}
public class NonPerishableProduct extends Product 
{
   private int shelfLife;
   
   public NonPerishableProduct(String productId, String Productname, int Quantity, double Price, int shelf) 
   {
   }  
   public void updateStock(int amount) 
   {
   }
}

