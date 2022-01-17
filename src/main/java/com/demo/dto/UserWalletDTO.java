package com.demo.dto;

import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class UserWalletDTO {

	private Long id;
	@NotNull(message = "Informe o id do usário")
	private Long users;
	@NotNull(message = "Informe o id da carteira")
	private Long wallet;
}
