package dev.decagon.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BellaStore {



    private List<Products> productsList = new ArrayList<>();

    public BellaStore() {
    }

    public BellaStore(List<Products> productsList) {
        this.productsList = productsList;
    }

    public List<Products> getProductsList() {
        return productsList;
    }

    public void setProductsList(List<Products> productsList) {
        this.productsList = productsList;
    }

    public void loadProducts(){
        String file = "/Users/decagon/Documents/decagon-assignments/week-two-sq012-Annahbellah/Bella-store/src/main/resources/Products Category - Sheet1.csv";
        BufferedReader reader;
        String line = "";

        try{
            reader = new BufferedReader(new FileReader(file));
            while((line = reader.readLine()) != null) {
              String[]  row = line.split(",");
              productsList.add(new Products(Long.parseLong(row[0]), row[1], Double.parseDouble(row[2]), Integer.parseInt(row[3]), row[4], row[5]));
            }
            setProductsList(productsList);
            reader.close();
        }
        catch(IOException e){
           e.printStackTrace();
        }
//        finally {
//          if(reader!=null){
//              try {
//                  reader.close();
//              }catch (IOException io)
//              {io.printStackTrace();}
//          }
//
//        }

    }
}
