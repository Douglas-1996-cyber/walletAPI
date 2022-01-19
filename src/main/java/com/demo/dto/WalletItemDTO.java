package com.demo.dto;

import java.math.BigDecimal;
import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;

import lombok.Data;

@Data
public class WalletItemDTO {
	
	private Long id;
	@NotNull(message ="Insira o id da carteira")
	private Long wallet;
	@NotNull(message ="Informe uma data")
	private Date date;
	@NotNull(message ="Informe um tipo")
	@Pattern(regexp = "^(ENTRDA|SAIDA)$", message= "Para o tipo somente são aceitos os valores ENTRDA ou SAIDA")
	private String type;
	@NotNull(message = "Informe uma descrição")
	@Length(min =5, message ="A descrição deve ter no minimo 5 carcteres")
	private String description;
	@NotNull(message= "Informe um valor")
	private BigDecimal value;

}
