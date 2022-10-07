package dev.decagon;


import dev.decagon.exceptions.InsufficientFundException;
import dev.decagon.exceptions.OutOfStockException;
import dev.decagon.model.BellaStore;
import dev.decagon.model.Customers;
import dev.decagon.model.Products;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        BellaStore store = new BellaStore();
        store.loadProducts();

        Customers customer=new Customers();
        customer.setFullName("Stephen King");
        customer.setBalance(5000000.00);

        try {
             System.out.println(customer.buy(customer,customer.productSearch(
                     "Hublot", (ArrayList<Products>) store.getProductsList())));
        }   catch (InsufficientFundException | OutOfStockException isfe){
            isfe.printStackTrace();
        }

        try{
             System.out.println(customer.buy(customer, customer.productSearch("rice",
                     (ArrayList<Products>) store.getProductsList())));
         }catch (OutOfStockException  | InsufficientFundException outOfStockException) {
             outOfStockException.printStackTrace();
         }
         
         finally {
             System.out.println("Thanks for coming!");
         }

    }
}














































