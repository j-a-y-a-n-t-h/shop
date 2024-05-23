package com.shopping.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.shopping.model.Product;
import com.shopping.model.ProductMapper;

@Repository
public class ProductDaoImpl implements ProductDao {

	JdbcTemplate jdbcTemplate;

	private final String SQL_GET_ALL = "select * from j_products";

	@Autowired
	public ProductDaoImpl(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query(SQL_GET_ALL, new ProductMapper());
	}

}