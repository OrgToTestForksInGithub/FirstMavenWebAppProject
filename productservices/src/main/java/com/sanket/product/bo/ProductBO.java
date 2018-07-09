package com.sanket.product.bo;

import com.sanket.product.dto.Product;

public interface ProductBO {
	public void createProduct(Product product);
	
	public Product findProduct(int id);

}
