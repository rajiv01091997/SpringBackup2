package com.globallogic.dto;

public class ProductDto {

private int productId;
private String productName;
private String productCategory;
private double productPrice;
public ProductDto() {
	super();
	// TODO Auto-generated constructor stub
}

public ProductDto(int productId, String productName, String productCategory, double productPrice) {
	super();
	this.productId = productId;
	this.productName = productName;
	this.productCategory = productCategory;
	this.productPrice = productPrice;
}

public int getProductId() {
	return productId;
}

public void setProductId(int productId) {
	this.productId = productId;
}

public String getProductName() {
	return productName;
}

public void setProductName(String productName) {
	this.productName = productName;
}

public String getProductCategory() {
	return productCategory;
}

public void setProductCategory(String productCategory) {
	this.productCategory = productCategory;
}

public double getProductPrice() {
	return productPrice;
}

public void setProductPrice(double productPrice) {
	this.productPrice = productPrice;
}



	
	
}
