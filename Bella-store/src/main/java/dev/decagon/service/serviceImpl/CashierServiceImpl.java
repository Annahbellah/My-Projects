package dev.decagon.service.serviceImpl;

import dev.decagon.exceptions.OutOfStockException;
import dev.decagon.model.Customers;
import dev.decagon.model.Products;
import dev.decagon.service.CashierService;

public class CashierServiceImpl implements CashierService {
    @Override
    public String sellProducts(Products products, Customers customers) {
        if (customers.buy(customers, products).equals("Purchase Successful")){
            issueReceipts(customers, products);
            return "SOLD";
        }else{
            throw new OutOfStockException("Product is out of stock");
        }
    }

    @Override
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
