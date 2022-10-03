package dev.decagon.model;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BellaStore {
   private List<Products> productsList = new ArrayList();
   private List<Products> customerCart = new ArrayList();

    public BellaStore() {
    }

    public BellaStore(List<Products> productsList, List<Products> customerCart) {
        this.productsList = productsList;
        this.customerCart = customerCart;
    }

    public List<Products> getProductsList() {
        return productsList;
    }

    public List<Products> getCustomerCart() {
        return customerCart;
    }
    public List<Products> fileReader() throws IOException {
        Scanner scanner = new Scanner(new File("/Users/decagon/Documents/decagon-assignments/week-two-sq012-Annahbellah/Bella-store/src/main/resources"));
        String [] temp;
        boolean first = true;
        String line;

        while(scanner.hasNext()) {
            line = scanner.nextLine();
            temp = line.split("'");
            if(first){
                first = false;
                continue;
            }
            Products products = new Products();
            products.setId(Long.valueOf(temp[0]));
            products.setProductName(temp[1]);
            products.setPrice(Double.parseDouble(temp[2]));
            products.setQuantity(Integer.parseInt(temp[3]));
            products.setDescription(temp[4]);
            products.setCategory(temp[5]);

            productsList.add(products);
        }
         scanner.close();
        return productsList;
    }

}
