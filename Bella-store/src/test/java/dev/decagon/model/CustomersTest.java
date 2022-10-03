package dev.decagon.model;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CustomersTest {

    @Test
    void ShouldReturnInsufficientFundWhenCustomersBalanceIsShortAndPurchaseSuccessfulOtherwise() {
            Products product1 = new Products(1L, "Joy Soap", 200, 50, "Bar Soap", "Cosmetics");
            Products product2 = new Products(2L, "Pears", 5000, 20, "Body Lotion", "Cosmetics");
            Products product3 = new Products(3L, "Always", 2000, 100,"Sanitary Pad", "toiletories" );

        ArrayList<Products> cart = new ArrayList();
        cart.add(product1);
        cart.add(product2);
        cart.add(product3);

        Customers customer = new Customers("Stephen King", 28, "sk@gmail.com", 12, 50000, cart);
        System.out.println(customer.buy(customer, product2));

        String result1 = customer.buy(customer, product1);
        String result2 = customer.buy(customer, product2);

        Assert.assertEquals("Insufficient Fund",result2);
    }
}