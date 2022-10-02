package dev.decagon.model;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CashierTest {

    @Test
    void ShouldReturnSOLDIfPurchaseIsSuccessful() {
        Products product1 = new Products("Soap", 200, 50);
        Products product2 = new Products("Body Lotion", 5000, 20);
        Products product3 = new Products("Sanitary Pad", 2000, 100);

        ArrayList<Products> cart = new ArrayList();
        cart.add(product1);
        cart.add(product2);
        cart.add(product3);

        Customers customer = new Customers("Stephen King", 28, "sk@gmail.com", 12, 50000, cart);
        customer.buy(customer, product1);
        customer.buy(customer, product2);
        customer.buy(customer, product3);

        Cashier cashier = new Cashier("Baby Girl", 23, "babygirl4live@gmail.com", 31);
        String result1 = cashier.sellProducts(product1, customer);
        String result2 = cashier.sellProducts(product2, customer);

        Assert.assertEquals("SOLD", result1);


    }

    @Test
    void issueReceipts() {
        Products product1 = new Products("Soap", 200, 50);
        Products product2 = new Products("Body Lotion", 5000, 20);
        Products product3 = new Products("Sanitary Pad", 2000, 100);

        ArrayList<Products> cart = new ArrayList();
        cart.add(product1);
        cart.add(product2);
        cart.add(product3);

        Customers customer = new Customers("Stephen King", 28, "sk@gmail.com", 12, 50000, cart);
        customer.buy(customer, product1);
        customer.buy(customer, product2);
        customer.buy(customer, product3);

        Cashier cashier = new Cashier("Baby Girl", 23, "babygirl4live@gmail.com", 31);
        String result1 = cashier.issueReceipts(customer, product1);

        Assert.assertEquals("RECEIPT", result1);

    }
}