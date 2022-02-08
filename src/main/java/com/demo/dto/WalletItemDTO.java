package com.demo.dto;

import java.math.BigDecimal;
import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes;

import lombok.Data;

@Data
public class WalletItemDTO {
	
	private Long id;
	@NotNull(message ="Insira o id da carteira")
	private Long wallet;
	@NotNull(message ="Informe uma data")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy", locale = "pt-BR", timezone ="Brazil/East")
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
