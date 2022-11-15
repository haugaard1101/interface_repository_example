package com.example.interface_repository.repository;


import com.example.interface_repository.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductInMemRepository<T> implements IProductRepository<T> {

  private List<Product> products;

  public ProductInMemRepository() {
    products = new ArrayList<>();
    products.add(new Product(1, "Car", 999.95));
    products.add(new Product(2, "Bicycle", 49.95));
    products.add(new Product(3, "Milk", 19.95));
  }

  @Override
  public void create(T p) {

  }

  @Override
  public List<T> readAll() {
    return (List<T>) products;
  }

  @Override
  public T read(int id) {
    return (T) products.get(id - 1);
  }

  @Override
  public void update() {

  }

  @Override
  public void delete() {

  }


}
