package co.app.front.controller;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.hibernate.validator.constraints.ParameterScriptAssert;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.core.ParameterizedTypeReference;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import co.app.common.dto.CategoryDto;
import co.app.common.dto.GenericDto;
import co.app.common.dto.ProductDto;
import co.app.common.dto.UserDto;
import co.app.common.util.Constant;
import co.app.front.util.Rest;
/**
 * In this class is the controller to handle everything that has to do with the front-end
 * @author yadira muñoz herrera
 *
 */
@Controller
@SessionAttributes({ "userLogin" })
public class ProductController {

	@Autowired
	public Rest<GenericDto> rest;

	@Autowired
	public Rest<CategoryDto> categoryDto;

	@Autowired
	public Rest<ProductDto> product;

	@Autowired
	public ObjectMapper objMap;

	@Autowired
	public Rest<UserDto> user;

	@GetMapping(Constant.APP_FRONT_CONTROLLER_PRODUCT)
	public String productList(Model model) {
		GenericDto list = rest.get("http://localhost:9041/get_product", new ParameterizedTypeReference<GenericDto>() {
		});		
		model.addAttribute("Titulo", "LISTA DE PRODUCTOS");
		model.addAttribute("products", list.getListObjects());		
		return "products";
	}
	
	@GetMapping(Constant.APP_FRONT_CONTROLLER_PRODUCT_ID)
	public String findById(@PathVariable("idProduct") Long id, Model model) {
		ProductDto prodId=product.get("http://localhost:9041/get_product",
				new ParameterizedTypeReference<ProductDto>() {});
		System.out.println(prodId);
		model.addAttribute("id", prodId);
		return "productDetail";
		
	}

	@GetMapping(value = Constant.APP_FRONT_CONTROLLER_HOME)
	public String home(Model model) {

		return "home";
	}

	@GetMapping(value = Constant.APP_FRONT_CONTROLLER_SHIPPING_CAR)
	public String shippingCar(Model model) {
		model.addAttribute("Titulo", "CARRITO DE COMPRAS");
		return "shippingCar";
	}
	
	
	@GetMapping(value = Constant.APP_FRONT_CONTROLLER_CREATE_PRODUCT_VIEW)
	public String createProduct(Model model) {

		GenericDto list = rest.get("http://localhost:9041/get_category_available",
				new ParameterizedTypeReference<GenericDto>() {
				});
		
		model.addAttribute("categories", list.getListObjects());
		return "createProduct";
	}

	@PostMapping(value = Constant.APP_FRONT_CONTROLLER_CREATE_PRODUCT)
	public String createProduct(@RequestParam(name = "file", required = false) MultipartFile pic, Model model,
			ProductDto productDto, RedirectAttributes flash) {

		try {
			product.post(objMap.writeValueAsString(productDto), new ParameterizedTypeReference<ProductDto>() {
			}, "http://localhost:9041/create_product");
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		if (!pic.isEmpty()) {
			String paths = "C://Temp//uploads";
			try {
				byte[] bytes = pic.getBytes();
				Path absolutePath = Paths.get(paths + "//" + pic.getOriginalFilename());
				productDto.setPicture(pic.getOriginalFilename());
			} catch (Exception e) {
				e.printStackTrace();
			}
			flash.addFlashAttribute("success", "Producto agregado correctamente");
		}
		return "redirect:/create_product";
	}

	@GetMapping(Constant.APP_FRONT_CONTROLLER_LOGIN)
	public String login(Model model) {
		return "login";
	}

	@PostMapping(Constant.APP_FRONT_CONTROLLER_AUTH)
	public String authenticLogin(Model model, UserDto userDto) {
		try {
			UserDto infoLogin = user.post(objMap.writeValueAsString(userDto),
					new ParameterizedTypeReference<UserDto>() {
					}, "http://localhost:9040/login_auth");

			if (infoLogin.getCodeResponse() == 200) {
				model.addAttribute("userLogin", infoLogin);
				return "redirect:/home";
			}

		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return "login";
	}

}
