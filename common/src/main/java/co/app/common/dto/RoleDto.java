package co.app.common.dto;

public class RoleDto extends ResponseDto{

	private Long idRole;
	private String name;
	public Long getIdRole() {
		return idRole;
	}
	public void setIdRole(Long idRole) {
		this.idRole = idRole;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "RoleDto [idRole=" + idRole + ", name=" + name + "]";
	}
	
	
}
