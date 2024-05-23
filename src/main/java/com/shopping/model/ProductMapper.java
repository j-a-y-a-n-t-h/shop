package com.shopping.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class ProductMapper implements RowMapper<Product> {

	public Product mapRow(ResultSet rs, int i) throws SQLException {

		Product pd = new Product();
		pd.setProduct_id(rs.getInt("prod_id"));
		pd.setProd_title(rs.getString("prod_title"));
		pd.setImage(rs.getString("prod_image"));
		pd.setShipping_charge(rs.getInt("prod_shipping_charge"));
		pd.setProd_price(rs.getInt("prod_price"));
		// pd.setProd_mrp(rs.getInt("prod_mrp"));
		// pd.setGst(rs.getDouble("hsnc_gstc_percentage"));
		return pd;
	}
}
