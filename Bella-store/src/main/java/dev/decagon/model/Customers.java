package dev.decagon.model;


import dev.decagon.exceptions.InsufficientFundException;
import dev.decagon.exceptions.OutOfStockException;
import dev.decagon.service.CustomersService;

import java.util.ArrayList;
import java.util.List;

public class Customers extends Persons implements CustomersService {
    private double balance;
    private ArrayList<Products> cart;

    public Customers() {
        this.cart = new ArrayList<>();
    }

    public Customers(String fullName, Integer age, String email, Integer id, double balance) {
        super(fullName, age, email, id);
        this.balance = balance;
        this.cart = new ArrayList<>();
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public List<Products> getCart() {
        return cart;
    }


    @Override
    public String toString() {
        return "Customers{" +
                "balance=" + balance +
                ", cart=" + cart +
                '}';
    }

                                        public String buy(Customers customers, Products products) {
                                        if (customers.getBalance() >= products.getPrice() * products.getQuantity()){
                                            return "Purchase Successful";
                                        }else {
                                            throw new InsufficientFundException("Insufficient Fund");
                                        }
                                        }

                                        public Products productSearch(String productName,ArrayList<Products> productList){
                                            for (Products product:productList
                                                 ) {
                                                if(product.getProductName().equals(productName)){
                                                    return product;
                                                }
                                            }
                                            throw new OutOfStockException("product not available");
                                        }
}
