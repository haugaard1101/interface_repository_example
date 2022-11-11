package com.example.interface_repository.repository;

import com.example.interface_repository.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductInMemRepository implements IProductRepository {

  private List<Product> products;

  public ProductInMemRepository() {
    products = new ArrayList<>();
    products.add(new Product(1, "Car", 999.95));
    products.add(new Product(2, "Bicycle", 49.95));
    products.add(new Product(3, "Milk", 19.95));
  }

  @Override
  public void create(Product p) {

  }

  @Override
  public List<Product> readAll() {
    return products;
  }

  @Override
  public Product read(int id) {
    return products.get(id - 1);
  }

  @Override
  public void update(Product p) {

  }

  @Override
  public void delete(Product p) {

  }


}
