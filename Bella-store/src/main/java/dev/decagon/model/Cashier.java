package dev.decagon.model;


import dev.decagon.interfaces.CashierInterface;

public class Cashier extends Persons implements CashierInterface {

    public Cashier() {
    }

    public Cashier(String fullName, Integer age, String email, Integer id) {
        super(fullName, age, email, id);
    }


    public String sellProducts(Products products, Customers customers) {
        if (customers.buy(customers, products).equals("Purchase Successful")){
            issueReceipts(customers, products);
            return "SOLD";
        }else{
            return null;
        }
    }


    public String issueReceipts(Customers customers, Products products) {
            System.out.println("#############RECIEPTS###############");
            System.out.println("Name: " + customers.getFullName());
            System.out.println("Items: " + products.getProductName());
            System.out.println("QTY: " + products.getQuantity());
            System.out.println("PRICE: " + products.getPrice());
            System.out.println("TOTAL: " + products.getPrice() * products.getQuantity());

            return "RECEIPT";
    }
}
