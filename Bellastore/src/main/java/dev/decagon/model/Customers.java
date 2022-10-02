package dev.decagon.model;


import dev.decagon.interfaces.CustomersInterface;

import java.util.ArrayList;
import java.util.List;

public class Customers extends Persons implements CustomersInterface {
    private double balance;
    private ArrayList<Products> cart;

    public Customers() {

    }

    public Customers(String fullName, Integer age, String email, Integer id, double balance, ArrayList<Products> cart) {
        super(fullName, age, email, id);
        this.balance = balance;
        this.cart = cart;
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

    public void setCart(ArrayList<Products> cart) {
        this.cart = cart;
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
        return "Insufficient Fund";
    }
    }
}
