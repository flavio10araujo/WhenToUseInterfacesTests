package com.tests.whentouseinterface.entities.animals.mammals.cats;

import com.tests.whentouseinterface.entities.animals.mammals.Cat;
import com.tests.whentouseinterface.interfaces.ITransportable;

public class Persa extends Cat implements ITransportable {

  private String name;
  private Double price;
  private Double weight;
  
  public Persa(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

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