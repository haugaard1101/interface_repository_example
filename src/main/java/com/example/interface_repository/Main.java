package com.example.interface_repository;

import com.example.interface_repository.repository.IProductRepository;
import com.example.interface_repository.repository.ProductDBRepository;
import com.example.interface_repository.repository.ProductInMemRepository;

public class Main {
  public static void main(String[] args) {
    IProductRepository product = new ProductDBRepository();
    System.out.println(product.readAll());
    System.out.println(product.read(1));
  }
}
