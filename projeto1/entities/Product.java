package entities;

public class Product {
   public String nome;
   public double price;
   public int quantity;

   public double totalValueInStock(){
       return price * quantity;
   }
   public void addProducts( int quantity){
       this.quantity += quantity;
   }
   public void removeProducts(int quantity){
       this.quantity -= quantity;
   }

   public String toString(){
       return nome
               + ", $ "
               +String.format("%.2f", price)
               + ", "
               + quantity
               + " units, Total: $ "
               +String.format("%.2f", totalValueInStock());
   }



}
