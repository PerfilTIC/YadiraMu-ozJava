package co.app.front.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.core.ParameterizedTypeReference;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import co.app.common.dto.CategoryDto;
import co.app.common.dto.GenericDto;
import co.app.common.dto.ProductDto;
import co.app.common.util.Constant;
import co.app.front.util.Rest;


@Controller
public class ProductController {	
	
	@Autowired
	public Rest<GenericDto> rest;
	
	@Autowired
	public Rest<CategoryDto> categoryDto;
	
	@Autowired
	public Rest<ProductDto> product;
	
	@Autowired
	public ObjectMapper objMap;
	
	@GetMapping(Constant.APP_FRONT_CONTROLLER_PRODUCT)
	public String productList(Model model) {
		GenericDto list = rest.get("http://localhost:9041/get_product", new ParameterizedTypeReference<GenericDto>() {
		});		
		model.addAttribute("Titulo", "LISTA DE PRODUCTOS");
		model.addAttribute("products",list.getListObjects());		
		return "products";
	}
	
	@GetMapping(value= Constant.APP_FRONT_CONTROLLER_HOME)
	public String home(Model model) {
		
		return "home";		
	}
	
	@GetMapping(value= Constant.APP_FRONT_CONTROLLER_SHIPPING_CAR)
	public String shippingCar(Model model) {
		model.addAttribute("Titulo", "CARRITO DE COMPRAS");
		return "shippingCar";
	}
	
	@PostMapping(value= Constant.APP_FRONT_CONTROLLER_CREATE_PRODUCT)
	public String createProduct(Model model, ProductDto productDto) {
		
		
		try {
			model.addAttribute("products", product.post(objMap.writeValueAsString(productDto), new ParameterizedTypeReference<ProductDto>() {
			}, "http://localhost:9041/create_product"));
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return "createProduct";
	}
	
	@GetMapping(Constant.APP_FRONT_CONTROLLER_LOGIN)
	public String login(Model model) {
		return "login";
	}

	
}
