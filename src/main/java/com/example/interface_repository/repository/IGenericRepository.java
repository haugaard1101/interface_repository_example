package com.example.interface_repository.repository;

import java.util.List;

//<E> gør den generisk
public interface IGenericRepository<E> {

  List<E> readAll();

  E read();

  void create(E e);

  void update(E e);

  void delete(int id);


}
