package com.example.interface_repository.repository;

import com.example.interface_repository.model.Product;

import java.util.List;

public interface IProductRepository {
  //Create
  void create(Product p);

  //Read
  List<Product> readAll();

  Product read(int id);

  //Update
  void update(Product p);

  //Delete
  void delete(Product p);

}
