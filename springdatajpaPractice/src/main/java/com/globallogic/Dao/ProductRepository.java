package com.globallogic.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.globallogic.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

	public List<Product> findByCategory(String category);
	public Product findByProductName(String name);
	public Product findByProductNameAndPrice(String name,Integer price);
	public Product findByPriceAndCategory(int price, String category);
}
