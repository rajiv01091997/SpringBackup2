package com.globallogic.Service;

import java.util.List;

import com.globallogic.Modal.Product;

public interface IProductService {
	public Product addProduct(Product product);

	public Product getProductById(int id);

	public List<Product> getAllProduct();

	public List<Product> getByCategory(String Category);

	public Product getByCategoryAndPrice(String Category, double price);

	public Product updateProductById(int id);
}
