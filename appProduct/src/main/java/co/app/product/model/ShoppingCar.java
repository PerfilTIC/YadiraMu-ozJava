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
public class ShoppingCar implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7942724127022959845L;
	
	@Id	
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
	@Column(name = "idShopCar")
	private Long idShpCar;
	
	@ManyToOne
	@JoinColumn(columnDefinition = "product", referencedColumnName = "idProduct")
	private Product productCar;
	
	@ManyToOne
	@JoinColumn(columnDefinition = "category", referencedColumnName = "idCategory")
	private Category categoryCar;

	public Long getIdShpCar() {
		return idShpCar;
	}

	public void setIdShpCar(Long idShpCar) {
		this.idShpCar = idShpCar;
	}

	public Product getProductCar() {
		return productCar;
	}

	public void setProductCar(Product productCar) {
		this.productCar = productCar;
	}

	public Category getCategoryCar() {
		return categoryCar;
	}

	public void setCategoryCar(Category categoryCar) {
		this.categoryCar = categoryCar;
	}

	@Override
	public String toString() {
		return "ShoppingCar [idShpCar=" + idShpCar + ", productCar=" + productCar + ", categoryCar=" + categoryCar
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((categoryCar == null) ? 0 : categoryCar.hashCode());
		result = prime * result + ((idShpCar == null) ? 0 : idShpCar.hashCode());
		result = prime * result + ((productCar == null) ? 0 : productCar.hashCode());
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
		ShoppingCar other = (ShoppingCar) obj;
		if (categoryCar == null) {
			if (other.categoryCar != null)
				return false;
		} else if (!categoryCar.equals(other.categoryCar))
			return false;
		if (idShpCar == null) {
			if (other.idShpCar != null)
				return false;
		} else if (!idShpCar.equals(other.idShpCar))
			return false;
		if (productCar == null) {
			if (other.productCar != null)
				return false;
		} else if (!productCar.equals(other.productCar))
			return false;
		return true;
	}

	public ShoppingCar(Long idShpCar) {
		super();
		this.idShpCar = idShpCar;
	}

	public ShoppingCar() {
		super();
	}

}
