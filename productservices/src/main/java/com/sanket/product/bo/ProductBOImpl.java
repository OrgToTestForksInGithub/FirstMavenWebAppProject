package com.sanket.product.bo;

import com.sanket.product.dao.ProductDAO;
import com.sanket.product.dto.Product;

public class ProductBOImpl implements ProductBO {

	private ProductDAO dao;

	@Override
	public void createProduct(Product product) {
		dao.create(product);
	}

	@Override
	public Product findProduct(int id) {
		return dao.read(id);
	}

	public ProductDAO getDao() {
		return dao;
	}

	public void setDao(ProductDAO dao) {
		this.dao = dao;
	}

}
