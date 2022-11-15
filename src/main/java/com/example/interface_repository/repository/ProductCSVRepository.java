package com.example.interface_repository.repository;

import com.example.interface_repository.model.Product;

import java.util.List;

public class ProductCSVRepository<T> implements IProductRepository<T>{
  @Override
  public void create(T p) {

  }

  @Override
  public List<T> readAll() {
    return null;
  }

  @Override
  public T read(int id) {
    return null;
  }

  @Override
  public void update() {

  }

  @Override
  public void delete() {

  }
}
