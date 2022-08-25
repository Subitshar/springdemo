package com.samples.controller;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.samples.dao.EProductDAO;
import com.samples.entity.Eproduct;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


@Controller
public class MainController {

	@Autowired
	EProductDAO eproductDAO;

	@RequestMapping(value="/listProducts",method = RequestMethod.GET)
	public String listProducts(ModelMap map) {
		List<Eproduct> list = eproductDAO.getProducts();
		map.addAttribute("list", list);
		return "listProducts";
	}
}
