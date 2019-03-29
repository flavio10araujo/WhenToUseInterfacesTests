package com.tests.whentouseinterface.entities.electronics.mobilePhones.samsungs;

import com.tests.whentouseinterface.entities.electronics.mobilePhones.Samsung;
import com.tests.whentouseinterface.interfaces.ISamsung;
import com.tests.whentouseinterface.interfaces.ITransportable;

public class S8 extends Samsung implements ITransportable, ISamsung {

  private Double price;
  private Double weight;
  
  @Override
  public void setPrice(Double price) {
    this.price = price;
  }

  @Override
  public Double getPrice() {
    return this.price;
  }

  @Override
  public void setWeight(Double weight) {
    this.weight = weight;
  }

  @Override
  public Double getWeight() {
    return this.weight;
  }

}