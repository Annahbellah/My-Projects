package dev.decagon;


import dev.decagon.Enums.Qualification;
import dev.decagon.model.*;

import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Products product1 = new Products(1L," Joy Soap", 200, 50,"Bar soap", "Cosmetics");
        Products product2 = new Products(2L, "Pears", 5000, 20, "Body lotion", "Cosmetics");
        Products product3 = new Products(3L,"Always", 2000, 100, "Sanitory Pad","Toiletories");

        ArrayList<Products> cart = new ArrayList();
        cart.add(product1);
        cart.add(product2);
        cart.add(product3);

        Customers customer = new Customers("Stephen King", 28, "sk@gmail.com", 12, 50000, cart);
//        System.out.println(customer.buy(customer, product1));
//        System.out.println(customer.buy(customer, product2));
//        System.out.println(customer.buy(customer, product3));

        Applicant applicant1 = new Applicant("Ijeoma Thompson", 18,
                "ij@gmail.com", 10, Qualification.BSC, "Cashier");
        Applicant applicant2 = new Applicant("John Moss", 30, "jm@gmail.com",
                20, Qualification.HND, "Cashier");

        Manager manager = new Manager("Bella Tim", 22, "anabella@gmail.com", 23);
//        System.out.println(manager.hire(applicant1));
//        System.out.println(manager.hire(applicant2));

//        System.out.println(applicant1.apply(applicant1));
//        System.out.println(applicant1.apply(applicant2));

        BellaStore store = new BellaStore();
        store.loadProducts();
        for (Products product:store.getProductsList()
             ) {
            System.out.println(product.toString());
        }
    }
}