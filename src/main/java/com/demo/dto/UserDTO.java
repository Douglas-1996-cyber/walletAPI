package com.demo.dto;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;




public class UserDTO {
	
	private Long id;
	@NotNull
	@Length(min=6, message="A senha deve conter no minimo 6 caracteres")
	private String password;
    @Length(min=3, max=50, message="o nome deve conter entre 3 e 5 caracteres ")
	private String name;
	@Email(message = "Email invalido")
	private String email;
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getId() {
		return id;
	}
	


}
