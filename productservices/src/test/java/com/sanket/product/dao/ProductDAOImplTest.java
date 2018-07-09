package com.sanket.product.dao;

import static org.junit.Assert.*;

import org.junit.Test;

import com.sanket.product.dto.Product;

public class ProductDAOImplTest {

	@Test
	public void shouldCreateAProduct() {
		ProductDAO dao = new ProductDAOImpl();
		Product product = new Product();
		product.setId(1);
		product.setName("Macbook Pro");
		product.setDescription("Mind Blowing");
		product.setPrice(2699);
		dao.create(product);
		
		Product result = dao.read(1);
		assertNotNull(result);
		assertEquals("Macbook Pro", result.getName());
	}

}
