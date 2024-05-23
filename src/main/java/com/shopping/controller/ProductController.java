package com.shopping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.shopping.dao.ProductDaoImpl;
import com.shopping.model.Product;

@Controller
public class ProductController {
	ProductDaoImpl pdao;

	@Autowired
	public ProductController(ProductDaoImpl pddao) {
		pdao = pddao;
	}

	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public String getAllProducts(Model model) {

		System.out.println("products List JSP Requested");
		List<Product> pdList = pdao.getAllProducts();
		model.addAttribute("pdlist", pdList);
		// call view
		return "home";

	}

}
