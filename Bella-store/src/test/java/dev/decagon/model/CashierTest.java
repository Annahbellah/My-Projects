package dev.decagon.model;

import dev.decagon.exceptions.InsufficientFundException;
import dev.decagon.service.CashierService;
import dev.decagon.service.serviceImpl.CashierServiceImpl;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CashierTest {

    @Test
    void ShouldReturnSOLDIfPurchaseIsSuccessful() {

        Products product1 = new Products(1L, "Joy Soap", 200, 50, "Bar Soap", "Cosmetics");
        Products product2 = new Products(2L, "Pears", 5000, 20, "Body Lotion", "Cosmetics");
        Products product3 = new Products(3L, "Always", 2000, 100,"Sanitary Pad", "toiletories" );

        ArrayList<Products> cart = new ArrayList();
        cart.add(product1);
        cart.add(product2);
        cart.add(product3);

        Customers customer = new Customers("Stephen King", 28, "sk@gmail.com", 12, 50000);


        CashierService cashierService = new CashierServiceImpl();
        String expectedMessage = "Insufficient Fund";

         Assert.assertThrows(InsufficientFundException.class,()->cashierService.sellProducts(product2, customer));


    }

   @Test
    void issueReceipts() {
        Products product1 = new Products(1L, "Joy Soap", 200, 50, "Bar Soap", "Cosmetics");

        ArrayList<Products> cart = new ArrayList();
        cart.add(product1);

        Customers customer = new Customers("Stephen King", 28, "sk@gmail.com", 12, 50000);
        customer.buy(customer, product1);


        CashierService cashierService = new CashierServiceImpl();
        String result1 = cashierService.issueReceipts(customer, product1);

       Assert.assertEquals("RECEIPT", result1);

    }
}