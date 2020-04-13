package co.app.common.dto;
/**
 * 
 *DTO with the data of the product entity
 * @author yadira muñoz herrera
 *
 */
public class ProductDto extends ResponseDto{

	private Long idProduct;
	private String name;
	private String description;
	private float weight;
	private float price;
	private String picture;
	private CategoryDto category;

	public Long getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(Long idProduct) {
		this.idProduct = idProduct;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public CategoryDto getCategory() {
		return category;
	}

	public void setCategory(CategoryDto category) {
		this.category = category;
	}
	
	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	@Override
	public String toString() {
		return "ProductDto [idProduct=" + idProduct + ", name=" + name + ", description=" + description + ", weight="
				+ weight + ", price=" + price + ", picture=" + picture + ", category=" + category + "]";
	}

	
}
