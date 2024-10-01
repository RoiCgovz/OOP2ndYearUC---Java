public class Main
{
   public static void main(String[] args) 
   {
      PerishableProduct apple = new PerishableProduct("P001", "Apple", 50, 0.5, "2024-12-31"); 
      inventory.addProduct(apple);
      NonPerishableProduct rice = new NonPerishableProduct("NP001", "Rice", 200, 1.0, 365); 
      inventory.addProduct(rice);
      apple.updateStock(30);
      
      try
      {
         apple.updateStock(30); // Total would be 110
      } 
      catch (Exception e) 
      {
         System.out.println(e.getMessage());
      }
      try 
      {
        inventory.removeProduct("P001");
      } 
      catch (InsufficientStockException e) 
      {
        System.out.println(e.getMessage());
      }
      try 
      {
         apple.updateStock(60); // Attempting to remove more than available
      } 
      catch (InsufficientStockException e) 
      {
         System.out.println(e.getMessage());
      }
      try 
      {
         apple.updateStock(-10);
      } 
      catch (InvalidQuantityException e) 
      {
         System.out.println(e.getMessage());
      }

   }
}
