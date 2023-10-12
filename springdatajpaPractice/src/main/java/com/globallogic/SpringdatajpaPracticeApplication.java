package com.globallogic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.globallogic.Dao.ProductRepository;
import com.globallogic.entity.Product;

@SpringBootApplication
public class SpringdatajpaPracticeApplication implements CommandLineRunner{

	
	
	@Autowired
	ProductRepository productRepository ;
	public static void main(String[] args) {
		SpringApplication.run(SpringdatajpaPracticeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		 
		//first product making
		Product product=new Product();
		product.setProductId(1);
		product.setProductName("Laptop");
		product.setCategory("Electronics");
		product.setPrice(60000);
		
		//second product making
		Product product1=new Product();
		product1.setProductId(2);
		product1.setProductName("Mobile");
		product1.setCategory("Electronics");
		product1.setPrice(30000);
		
		//added some more product from workbench
		
		productRepository.save(product);
		productRepository.save(product1);
		System.out.println("Inserted successfully");
		//added some more product from workbench directly
	
		
		System.out.println("=========Fetch all================================");
		List<Product> prod=productRepository.findAll();
		for(Product pr:prod)
		{
			System.out.println(pr);
		}
		
		System.out.println("=============fetch based on Id====================");
		Product prod1=productRepository.findById(3).get();
		System.out.println(prod1);
		
		System.out.println("==============fetch By Category===================");
		List<Product> prod2=productRepository.findByCategory("Plastic");
		for(Product pr:prod2)
		{
			System.out.println(pr);
		}
		
		System.out.println("==============fetch By Name========================");
		Product prod3=productRepository.findByProductName("Chair");
		System.out.println(prod3);
		
		System.out.println("==============fetch by product name and price======");
		Product prod4=productRepository.findByProductNameAndPrice("Chair", 1200);
		System.out.println(prod4);
		
		System.out.println("==============fetch by Category and price======");
		Product prod5=productRepository.findByPriceAndCategory(12000,"Electronics");
		System.out.println(prod5);
	}

}
