package dev.decagon.service;


import dev.decagon.model.Customers;
import dev.decagon.model.Products;

public interface CashierService {
    public String sellProducts(Products products, Customers customers);
    public String issueReceipts(Customers customers, Products products);
}
