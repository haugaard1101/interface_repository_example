package com.example.interface_repository.repository;

import com.example.interface_repository.model.Product;
import com.example.interface_repository.repository.util.DatabaseConnectionManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class ProductDBRepository implements IProductRepository{

  private Connection conn = DatabaseConnectionManager.getConnection();

  @Override
  public void create(Product p) {

  }

  @Override
  public List<Product> readAll() {
    return null;
  }

  @Override
  public Product read(int id) {
    try {
      PreparedStatement psts = conn.prepareStatement("SELECT * from product WHERE id = ?");
      psts.setInt(1 , id);
      ResultSet resultSet = psts.executeQuery();
      if(resultSet.next()){
        return new Product(
            resultSet.getInt("id"),
            resultSet.getString("name"),
            resultSet.getDouble("price")
        );
      }

    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
    return new Product();
  }


  @Override
  public void update(Product p) {

  }

  @Override
  public void delete(Product p) {

  }
}
