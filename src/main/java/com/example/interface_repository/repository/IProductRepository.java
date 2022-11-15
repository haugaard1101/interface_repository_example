package com.example.interface_repository.repository;

import com.example.interface_repository.model.T;

import java.util.List;

public interface IProductRepository<T> {
  //Create
  void create(T p);

  //Read
  List<T> readAll();

  T read(int id);

  //Update
  void update();

  //Delete
  void delete();

}
