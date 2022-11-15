package com.example.interface_repository.repository;

import java.util.ArrayList;
import java.util.List;

public class GenericRepository<E> implements IGenericRepository<E> {

  List<E> names = new ArrayList<>();

  @Override
  public List<E> readAll() {
    return names;
  }

  @Override
  public E read() {
    return null;
  }

  @Override
  public void create(E e) {

  }

  @Override
  public void update(E e) {

  }

  @Override
  public void delete(int id) {

  }
}