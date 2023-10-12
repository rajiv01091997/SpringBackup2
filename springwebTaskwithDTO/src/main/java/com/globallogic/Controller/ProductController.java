package com.globallogic.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.globallogic.Exceptions.CategoryNotFound;
import com.globallogic.Exceptions.IdNotFoundException;
import com.globallogic.Modal.Product;
import com.globallogic.Service.IProductService;
import com.globallogic.Service.ProductServiceImpl;
import com.globallogic.dto.ProductDto;

@RestController
@RequestMapping("api/v1")
public class ProductController {
	@Autowired
	IProductService iProductService;
	
	@PostMapping("/product")
	public ResponseEntity<ProductDto> saveEmployee(@RequestBody  ProductDto productDto)
	{
		return new ResponseEntity<ProductDto>(iProductService.addProduct(productDto), HttpStatus.OK);
	}
	@GetMapping("/prod/{id}")
	public ResponseEntity<ProductDto> fetchById(@PathVariable   int id)
	{
		return new ResponseEntity<ProductDto>(iProductService.getProductById(id), HttpStatus.OK);
	}
	@GetMapping("/product")
	public ResponseEntity<List<ProductDto>> fetchAll()
	{
		return new ResponseEntity<List<ProductDto>>(iProductService.getAllProduct(), HttpStatus.OK);
	}
	@GetMapping("/product/{category}")
	public ResponseEntity<List<ProductDto>> fetchbyCategory(@PathVariable String category)
	{
	return new ResponseEntity<List<ProductDto>>(iProductService.getByCategory(category), HttpStatus.OK);
	}
	
	@GetMapping("/product/{category}/{price}")
	public ResponseEntity<ProductDto>  fetchByCategoryAndPrice(@PathVariable  String category, @PathVariable double price)
	{
		return new ResponseEntity<ProductDto>(iProductService.getByCategoryAndPrice(category, price), HttpStatus.OK);
	}
	
	
	

}
