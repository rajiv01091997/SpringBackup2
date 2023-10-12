package com.globallogic.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.globallogic.Modal.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
	public List<Product> findByProductCategory(String Category);

	public Product findByProductCategoryAndProductPrice(String Category, double price);

}
