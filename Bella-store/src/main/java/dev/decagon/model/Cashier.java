package dev.decagon.model;


import dev.decagon.exceptions.OutOfStockException;
import dev.decagon.service.CashierService;

public class Cashier extends Persons {

    public Cashier() {
    }

    public Cashier(String fullName, Integer age, String email, Integer id) {
        super(fullName, age, email, id);
    }



}
