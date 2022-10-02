package dev.decagon.interfaces;


import dev.decagon.model.Customers;
import dev.decagon.model.Products;

public interface CashierInterface {
    public String sellProducts(Products products, Customers customers);
    public String issueReceipts(Customers customers, Products products);
}
