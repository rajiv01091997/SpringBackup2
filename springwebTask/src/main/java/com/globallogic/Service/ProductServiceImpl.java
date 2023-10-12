package com.globallogic.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.globallogic.Exceptions.CategoryNotFound;
import com.globallogic.Exceptions.IdNotFoundException;
import com.globallogic.Exceptions.PriceException;
import com.globallogic.Modal.Product;
import com.globallogic.Repository.ProductRepository;

@Service
public class ProductServiceImpl implements IProductService {

	@Autowired
	ProductRepository productRepository;

	@Override
	public Product addProduct(Product product) {
		// TODO Auto-generated method stub
		if (product.getProductPrice() < 400)
			throw new PriceException("price cannot be less than 400");
		return productRepository.save(product);
	}

	@Override
	public Product getProductById(int id) {
		// TODO Auto-generated method stub

		Optional<Product> optprdct = productRepository.findById(id);
		if (optprdct.isEmpty())
			throw new IdNotFoundException("Entered id is not present in database");
		return productRepository.findById(id).get();
	}

	@Override
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return productRepository.findAll();
	}

	@Override
	public List<Product> getByCategory(String category) {
		// TODO Auto-generated method stub
		List<Product> list = productRepository.findByProductCategory(category);
		if (list.isEmpty())
			throw new CategoryNotFound("Entered category doesn't matches with any category in database");
		return productRepository.findByProductCategory(category);
	}

	@Override
	public Product getByCategoryAndPrice(String category, double price) {
		// TODO Auto-generated method stub
		return productRepository.findByProductCategoryAndProductPrice(category, price);
	}

	@Override
	public Product updateProductById(int id) {
		// TODO Auto-generated method stub
		// productRepository.
		return null;
	}

}
