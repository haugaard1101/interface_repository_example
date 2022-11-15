package com.example.interface_repository;

import com.example.interface_repository.model.Product;
import com.example.interface_repository.repository.*;

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    IProductRepository product = new ProductDBRepository();
    System.out.println(product.readAll());
    System.out.println(product.read(1));

    IGenericRepository<String> names = new GenericRepository<>();



    /*
    ArrayList<String> names = new ArrayList<>();
    ArrayList<Product> products = new ArrayList<>();
    ArrayList<Integer> integers = new ArrayList<>();
     */
  }
}
