package dev.decagon.service.serviceImpl;

import dev.decagon.exceptions.InsufficientFundException;
import dev.decagon.exceptions.OutOfStockException;
import dev.decagon.model.Customers;
import dev.decagon.model.Products;
import dev.decagon.service.CustomersService;

import java.util.ArrayList;

public class CustomerServiceImpl implements CustomersService {
    @Override
    public String buy(Customers customers, Products products) {
        if (customers.getBalance() >= products.getPrice() * products.getQuantity()){
            return "Purchase Successful";
        }else {
            throw new InsufficientFundException("Insufficient Fund");
        }
    }

    public Products productSearch(String productName, ArrayList<Products> productList){
        for (Products product:productList
        ) {
            if(product.getProductName().equals(productName)){
                return product;
            }
        }
        throw new OutOfStockException("product not available");
    }
}
