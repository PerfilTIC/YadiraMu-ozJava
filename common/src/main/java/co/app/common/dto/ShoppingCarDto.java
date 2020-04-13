package co.app.common.dto;
/**
 * 
 *DTO with the data of the shopping car entity
 * @author yadira muñoz herrera
 *
 */
public class ShoppingCarDto extends ResponseDto {

	private Long idShpCar;
	private ProductDto product;
	private CategoryDto category;
	public Long getIdShpCar() {
		return idShpCar;
	}
	public void setIdShpCar(Long idShpCar) {
		this.idShpCar = idShpCar;
	}
	public ProductDto getProduct() {
		return product;
	}
	public void setProduct(ProductDto product) {
		this.product = product;
	}
	public CategoryDto getCategory() {
		return category;
	}
	public void setCategory(CategoryDto category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "ShoppingCarDto [idShpCar=" + idShpCar + ", product=" + product + ", category=" + category + "]";
	}
	
	
}
