package com.newton.test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PriceList {

public double price;
private String name;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return  "price=" + price + "kr" +
                ", name='" + name + '\'' +
                '}';
    }

    public PriceList(double price, String name) {
        this.price = price;
        this.name = name;
    }
public ArrayList priceSort(PriceList a, PriceList b, PriceList c){

        ArrayList<PriceList> prislista = new ArrayList();

        prislista.add(a);
        prislista.add(b);
        prislista.add(c);

    for(int j =0; j< (prislista.size()); j++)
    if( prislista.get((prislista.size()-1)-j).getPrice() < prislista.get(j).getPrice()){

        PriceList test= prislista.get((prislista.size()-1)-j);
        PriceList test2= prislista.get(j);

        prislista.set(0,test);
        prislista.set(prislista.size(), test2);
    }

return prislista;
}
}
