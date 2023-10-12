package com.globallogic.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.globallogic.Exceptions.CategoryNotFound;
import com.globallogic.Exceptions.IdNotFoundException;
import com.globallogic.Exceptions.PriceException;
import com.globallogic.Modal.Product;
import com.globallogic.Repository.ProductRepository;
import com.globallogic.dto.ProductDto;

@Service
public class ProductServiceImpl implements IProductService {

@Autowired
ProductRepository productRepository;

@Override
public ProductDto addProduct(ProductDto productDto) {
	// TODO Auto-generated method stub
	if(productDto.getProductPrice()<300)
		throw new PriceException("Price should not be less than 300");
	
	
	Product product=new Product();
	product.setProductName(productDto.getProductName());
	product.setProductCategory(productDto.getProductCategory());
	product.setProductPrice(productDto.getProductPrice());
	productRepository.save(product);
	productDto.setProductId(product.getProductId());
	return productDto;
}

@Override
public ProductDto getProductById(int id) {
	// TODO Auto-generated method stub
	
	Optional<Product> product1=productRepository.findById(id);
	if(product1.isEmpty())
		throw new IdNotFoundException("this ID does not exist");
	
	Product product=productRepository.findById(id).get();
	ProductDto productDto=new ProductDto();
	productDto.setProductId(product.getProductId());
	productDto.setProductName(product.getProductName());
	productDto.setProductCategory(product.getProductCategory());
	productDto.setProductPrice(product.getProductPrice());
	return productDto;
}

@Override
public List<ProductDto> getAllProduct() {
	// TODO Auto-generated method stub
	List<ProductDto> list=new ArrayList<>();
	List<Product> listProduct=productRepository.findAll();
	for(Product tempList:listProduct)
	{
		ProductDto productDto=new ProductDto();
		productDto.setProductId(tempList.getProductId());
		productDto.setProductName(tempList.getProductName());
		productDto.setProductCategory(tempList.getProductCategory());
		productDto.setProductPrice(tempList.getProductPrice());
		list.add(productDto);
	}
	return list;
}

@Override
public List<ProductDto> getByCategory(String Category) {
	// TODO Auto-generated method stub
	List<ProductDto> list=new ArrayList<>();
	List<Product> listProduct=productRepository.findByProductCategory(Category);
	if(listProduct.isEmpty())
		throw new CategoryNotFound("Category does not match with any Product");
	
	for(Product tempList:listProduct)
	{
		ProductDto productDto=new ProductDto();
		productDto.setProductId(tempList.getProductId());
		productDto.setProductName(tempList.getProductName());
		productDto.setProductCategory(tempList.getProductCategory());
		productDto.setProductPrice(tempList.getProductPrice());
		list.add(productDto);
	}
	return list;
}

@Override
public ProductDto getByCategoryAndPrice(String Category, double price) {
	// TODO Auto-generated method stub
	Product product=productRepository.findByProductCategoryAndProductPrice(Category, price);
	ProductDto productDto=new ProductDto();
	productDto.setProductId(product.getProductId());
	productDto.setProductName(product.getProductName());
	productDto.setProductCategory(product.getProductCategory());
	productDto.setProductPrice(product.getProductPrice());
	return productDto;
}
}
