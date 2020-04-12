package co.app.product.model;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Category implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 14798621786516581L;
	
	@Id	
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
	@Column(name="idCategory")
	private Long idCategory;
	
	@Column(name = "name")
	private String nameCategory;
	
	
	@JoinColumn(columnDefinition = "category", referencedColumnName = "idCategory")
	@ManyToOne
	private Category category;
	
	
	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Category(Long idCategory) {
		super();
		this.idCategory = idCategory;
	}

	public Category() {
		super();
	}

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

	@Override
	public String toString() {
		return "Category [idCategory=" + idCategory + ", nameCategory=" + nameCategory 
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idCategory == null) ? 0 : idCategory.hashCode());
		result = prime * result + ((nameCategory == null) ? 0 : nameCategory.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Category other = (Category) obj;
		if (idCategory == null) {
			if (other.idCategory != null)
				return false;
		} else if (!idCategory.equals(other.idCategory))
			return false;
		if (nameCategory == null) {
			if (other.nameCategory != null)
				return false;
		} else if (!nameCategory.equals(other.nameCategory))
			return false;
		return true;
	}

}
