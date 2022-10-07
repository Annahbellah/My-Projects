package dev.decagon.model;

import dev.decagon.exceptions.InsufficientFundException;
import dev.decagon.exceptions.OutOfStockException;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;



class CustomersTest {

    private BellaStore store;
    private Customers customer;
    @BeforeEach
    void setUp() {
        store=new BellaStore();
        store.loadProducts();
        customer = new Customers("Stephen King", 28,
                "sk@gmail.com", 12, 50000);
    }

    @Test
    void ShouldReturnInsufficientFundWhenCustomersBalanceIsShortAndPurchaseSuccessfulOtherwise() {

        Assert.assertThrows(InsufficientFundException.class,()->customer.buy(customer,
                customer.productSearch("Hublot", (ArrayList<Products>) store.getProductsList())));
    }

    @Test
    void productSearch() {
        String productNameToSearch="Hublot";
        Products product=null;
        try{
            product=customer.productSearch(productNameToSearch, (ArrayList<Products>) store.getProductsList());
        }catch (OutOfStockException outOfStockException){
            outOfStockException.printStackTrace();
        }

        Assert.assertEquals(product.getProductName(),productNameToSearch);
    }

    @Test
    void productSearchWhenNotAvailable() {
        String productNameToSearch="rice";

        Assert.assertThrows(OutOfStockException.class,
                ()->customer.productSearch(productNameToSearch, (ArrayList<Products>) store.getProductsList()));
    }
}