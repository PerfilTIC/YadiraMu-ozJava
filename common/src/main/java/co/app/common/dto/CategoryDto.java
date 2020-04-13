package co.app.common.dto;


public class CategoryDto extends ResponseDto {

	private Long idCategory;	
	private String nameCategory;
	private CategoryDto category;
	
	public Long getIdCategory() {
		return idCategory;
	}
	public void setIdCategory(Long idCategory) {
		this.idCategory = idCategory;
	}
	public String getNameCategory() {
		return nameCategory;
	}
	public void setNameCategory(String nameCategory) {
		this.nameCategory = nameCategory;
	}
	
	public CategoryDto getCategory() {
		return category;
	}
	public void setCategory(CategoryDto category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "CategoryDto [idCategory=" + idCategory + ", nameCategory=" + nameCategory + ", category=" + category
				+ "]";
	}
	
		
}
