package co.app.common.util;

public class Constant {
	//message
	public static final String MESSAGE_PRODUCT_CREATE_SUCCESFUL="El producto se ha creado correctamente";	
	public static final String MESSAGE_PRODUCT_CREATE_ERROR="El producto no se ha podido crear";	
	public static final String MESSAGE_PRODUCT_GET_ALL_PRODUCT ="Se han obtenido todos los productos satisfactoriamente";
	public static final String MESSAGE_CATEGORY_CREATE_SUCCESFUL= "La categoria se ha creado satisfactoriamente";
	public static final String MESSAGE_CATEGORY_CREATE_ERROR="La categoria no se ha podido crear";
	public static final String MESSAGE_CATEGORY_GET_ALL="Se ha obtenido las categorias";
	
	//codes response
	
	public static final int RESPONSE_CODE_OK = 200;
	public static final int RESPONSE_CODE_BAD = 400;
	public static final int RESPONSE_CODE_ERROR_SERVER = 500;
	
	//url restController
	
	public static final String APP_PRODUCT_CONTROLLER_CREATE_PRODUCT = "/create_product";
	public static final String APP_PRODUCT_CONTROLLER_GET_ALL_PRODUCT ="/get_product";
	public static final String APP_PRODUCT_CONTROLLER_GET_CATEGORY_AVAILABLE ="/get_category_available";
	public static final String APP_PRODUCT_CONTROLLER_CREATE_CATEGORY="/create_category";
	
	//url controller
	public static final String APP_FRONT_CONTROLLER_HOME ="/home";
	public static final String APP_FRONT_CONTROLLER_PRODUCT ="/product";
	public static final String APP_FRONT_CONTROLLER_SHIPPING_CAR ="/car";
	public static final String APP_FRONT_CONTROLLER_CREATE_PRODUCT ="/create";
	public static final String APP_FRONT_CONTROLLER_LOGIN ="/login";
	
	//web
	public static final String HEADER_CONTENT_TYPE = "Content-Type";
	public static final String HEADER_APP_JSON = "application/json";
	public static final String HEADER_ACCEPT = "Accept";
}
