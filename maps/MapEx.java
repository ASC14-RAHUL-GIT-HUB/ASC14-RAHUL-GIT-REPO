package com.demo.maps;

import java.util.HashMap;
import java.util.Map;

public class MapEx {
    public static void main(String[] args) {
        m1();
    }
        public static void m1() {
            Map<Object,Object> map1 = new HashMap<Object,Object>();

            Laptop laptop1 = new Laptop("Inspirion", 70000);
            Laptop laptop2 = new Laptop("Thinkpad", 65000);
            map1.put("HP", laptop1);
            String laptopBrand = "Lenovo";
            map1.put(laptopBrand, laptop2);
            System.out.println(map1);
        }

}

class Laptop {
    String laptopName;
    float price;

    public Laptop (String laptopNameParam, float priceParam) {
        laptopName = laptopNameParam;
        price = priceParam;
    }

    @Override
    public String toString() {
        return "Laptop [laptop name: "+laptopName+", laptop price is Rs. "+price+"]";
    }
}