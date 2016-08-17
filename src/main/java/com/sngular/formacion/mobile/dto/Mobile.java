package com.sngular.formacion.mobile.dto;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain=true)
public class Mobile {

	private Long id;
	private String name;
	private String desc;
	private Double price;
}
