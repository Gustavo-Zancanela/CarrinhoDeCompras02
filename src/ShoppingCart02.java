public class ShoppingCart02 {
    public static void main(String[] args) {
        String custName = "Alex";
        String itemDesc = "Camisa";
        String message = custName+" quer comprar duas "+itemDesc;
        
        // Declare and initialize numeric fields: price, tax, quantity.   
        double preço = 10.00;
        double imposto = 2.50;
        int quantidade = 2;
        // Declare and assign a calculated totalPrice
        
        double totalPrice = (preço + imposto) * quantidade;
        // Modify message to include quantity 
        
        System.out.println(message);
         System.out.println("O custo total com imposto eh: " + totalPrice);
        
        // Print another message with the total cost
        
    }    
}
