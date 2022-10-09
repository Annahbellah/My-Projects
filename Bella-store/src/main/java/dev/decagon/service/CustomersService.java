package dev.decagon.service;


import dev.decagon.model.Customers;
import dev.decagon.model.Products;

public interface CustomersService {

    public String buy(Customers customers, Products products);
}
