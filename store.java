/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
  */
package model;

import model.product;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author boul3
 */
public class store {
    private String noun;
    private String storeID;
    private Map<product, Integer> products; 

public store(String storeID,String noun,Map<product, Integer> products){
        this.storeID = storeID;
        this.noun = noun;
        this.products = products;
}
    public String getNoun() {
        return noun;
    }

    public void setNoun(String noun) {
        this.noun = noun;
    }

    public String getStoreID() {
        return storeID;
    }

    public void setStoreID(String storeID) {
        this.storeID = storeID;
    }

    public Set getProducts() {
        Set<product> product = products.keySet();
        return product;
    }

    public void ModifyProduct (product p,int qte) {
       if (this.products.containsKey(p)) {
          this.products.put(p, this.products.get(p)+qte);
        }
       else{
           this.products.put(p,qte);
       }
    }
    public void RemoveProduct (product p) {
       this.products.remove(p);
    }

    private static class Product {

        public Product() {
        }
    }

  
    }
