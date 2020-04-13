package co.app.product.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**
 * This is the entity class or the one that creates the table Product in the database
 * @author yadira muñoz herrera
 *
 */
@Entity
@Table(name = "PRODUCT")
public class Product implements Serializable {
	
	private static final long serialVersionUID = -6909832271781591795L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
	@Column(name = "idProduct")
	private Long idProduct;

	@Column(name = "name")
	private String name;

	@Column(name = "description")
	private String description;

	@Column(name = "weight")	
	private float weight;

	@Column(name = "price")	
	private float price;

	@Column(name="picture")
	private String picture;
	
	@JoinColumn(columnDefinition = "category", referencedColumnName = "idCategory")
	@ManyToOne
	private Category idCategory;

	public Category getIdCategory() {
		return idCategory;
	}

	public void setIdCategory(Category idCategory) {
		this.idCategory = idCategory;
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

	public Product() {
		super();
	}

	public Product(Long idProduct) {
		super();
		this.idProduct = idProduct;
	}
	
	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	@Override
	public String toString() {
		return "Product [idProduct=" + idProduct + ", name=" + name + ", description=" + description + ", weight="
				+ weight + ", price=" + price + ", picture=" + picture + ", idCategory=" + idCategory + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((idCategory == null) ? 0 : idCategory.hashCode());
		result = prime * result + ((idProduct == null) ? 0 : idProduct.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((picture == null) ? 0 : picture.hashCode());
		result = prime * result + Float.floatToIntBits(price);
		result = prime * result + Float.floatToIntBits(weight);
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
		Product other = (Product) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (idCategory == null) {
			if (other.idCategory != null)
				return false;
		} else if (!idCategory.equals(other.idCategory))
			return false;
		if (idProduct == null) {
			if (other.idProduct != null)
				return false;
		} else if (!idProduct.equals(other.idProduct))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (picture == null) {
			if (other.picture != null)
				return false;
		} else if (!picture.equals(other.picture))
			return false;
		if (Float.floatToIntBits(price) != Float.floatToIntBits(other.price))
			return false;
		if (Float.floatToIntBits(weight) != Float.floatToIntBits(other.weight))
			return false;
		return true;
	}

	
}
