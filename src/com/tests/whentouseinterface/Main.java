package com.tests.whentouseinterface;

import java.util.ArrayList;
import java.util.List;

import com.tests.whentouseinterface.entities.animals.mammals.cats.Persa;
import com.tests.whentouseinterface.entities.electronics.mobilePhones.lgs.G5;
import com.tests.whentouseinterface.entities.electronics.mobilePhones.samsungs.S8;
import com.tests.whentouseinterface.interfaces.ISamsung;
import com.tests.whentouseinterface.interfaces.ITransportable;

public class Main {

  public static void main(String[] args) {
    
    Double deliverPrice = 0d;
    Double deliverWeight = 0d;
    Double deliverPriceSamsung = 0d;
    Double deliverWeightSamsung = 0d;
    
    List<ITransportable> deliver = fillDelivery();
    
    for (ITransportable item : deliver) {
      System.out.print("Price: " + item.getPrice());
      System.out.println(" Weight: " + item.getWeight());
      
      deliverPrice += item.getPrice();
      deliverWeight += item.getWeight();
      
      if (item instanceof ISamsung) {
        deliverPriceSamsung += item.getPrice();
        deliverWeightSamsung += item.getWeight();
      }
    }
    
    System.out.println("The total price of this deliver is: " + deliverPrice);
    System.out.println("The total weight of this deliver is: " + deliverWeight);
    
    System.out.println("The price of Samsung products in this deliver is: " + deliverPriceSamsung);
    System.out.println("The weight of Samsung products in this deliver is: " + deliverWeightSamsung);
  }

  public static List<ITransportable> fillDelivery() {
    List<ITransportable> items = new ArrayList<ITransportable>();
    
    Persa lora = new Persa("Lora");
    lora.setPrice(1249.99d);
    lora.setWeight(18.25d);
    items.add(lora);
    
    G5 g5_0001 = new G5();
    g5_0001.setPrice(630.00d);
    g5_0001.setWeight(2.50d);
    items.add(g5_0001);
    
    S8 s8_0001 = new S8();
    s8_0001.setPrice(829.99d);
    s8_0001.setWeight(2.75d);
    items.add(s8_0001);
    
    return items;
  }
  
}