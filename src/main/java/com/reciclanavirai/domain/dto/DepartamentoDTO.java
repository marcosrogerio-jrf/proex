package com.reciclanavirai.domain.dto;

import org.modelmapper.ModelMapper;

import com.reciclanavirai.domain.Departamento;

import lombok.Data;

@Data
public class DepartamentoDTO {
	private Long id;
	private String nome;
	
	public static DepartamentoDTO create(Departamento departamento) {
		ModelMapper modelMapper = new ModelMapper();
		return modelMapper.map(departamento, DepartamentoDTO.class);
	}
}
