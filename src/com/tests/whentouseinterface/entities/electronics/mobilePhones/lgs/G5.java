package com.tests.whentouseinterface.entities.electronics.mobilePhones.lgs;

import com.tests.whentouseinterface.entities.electronics.mobilePhones.LG;
import com.tests.whentouseinterface.interfaces.ITransportable;

public class G5 extends LG implements ITransportable {

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