package co.app.common.dto;

public class UserDto extends ResponseDto {


	private Long idUser;		
	private String name;
	private String username;
	private String password;
	private String email;
	private RoleDto role;
	
	public Long getIdUser() {
		return idUser;
	}
	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public RoleDto getRole() {
		return role;
	}
	public void setRole(RoleDto role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "UserDto [idUser=" + idUser + ", name=" + name + ", username=" + username + ", password=" + password
				+ ", email=" + email + ", role=" + role + "]";
	}
	
	
}
