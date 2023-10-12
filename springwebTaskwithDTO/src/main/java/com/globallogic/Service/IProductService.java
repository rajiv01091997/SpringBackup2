package com.globallogic.Service;

import java.util.List;

import com.globallogic.Modal.Product;
import com.globallogic.dto.ProductDto;

public interface IProductService {
public ProductDto addProduct(ProductDto productDto);
public ProductDto getProductById(int id);
public List<ProductDto> getAllProduct();
public List<ProductDto> getByCategory(String Category);
public ProductDto getByCategoryAndPrice(String Category,double price);

}
