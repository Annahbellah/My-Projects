package dev.decagon.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BellaStore {
    private List<Products> productsList=new ArrayList<>();

    public List<Products> getProductsList() {
        return productsList;
    }

    public void loadProducts(){
        String file = "/Users/decagon/Documents/decagon-assignments/week-two-sq012-Annahbellah/Bella-store/src/main/resources/Products Category - Sheet1.csv";
        BufferedReader reader = null;
        String line = "";

        try{
            reader = new BufferedReader(new FileReader(file));
            while((line = reader.readLine()) != null) {
              String[]  row = line.split(",");
              Products products = new Products();
              products.setId(Long.valueOf(row[0]));
              products.setProductName(row[1]);
              products.setPrice(Double.parseDouble(row[2]));
              products.setQuantity(Integer.parseInt(row[3]));
              products.setDescription(row[4]);
              products.setCategory(row[5]);
                productsList.add(products);

            }

        }
        catch(Exception e){

        }
        finally {
          if(reader!=null){
              try {
                  reader.close();
              }catch (IOException io){io.printStackTrace();}
          }

        }

    }

}
