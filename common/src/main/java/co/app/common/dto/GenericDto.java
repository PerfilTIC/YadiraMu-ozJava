package co.app.common.dto;

import java.util.List;

public class GenericDto extends ResponseDto {
	
	private List<Object> listObjects;

	public List<Object> getListObjects() {
		return listObjects;
	}

	public void setListObjects(List<Object> listObjects) {
		this.listObjects = listObjects;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((listObjects == null) ? 0 : listObjects.hashCode());
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
		GenericDto other = (GenericDto) obj;
		if (listObjects == null) {
			if (other.listObjects != null)
				return false;
		} else if (!listObjects.equals(other.listObjects))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "GenericDto [listObjects=" + listObjects + "]";
	}

	
}
