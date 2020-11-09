package com.reciclanavirai.domain.dto;

import org.modelmapper.ModelMapper;

import com.reciclanavirai.domain.Departamento;
import com.reciclanavirai.domain.Gestor;

import lombok.Data;

@Data
public class GestorDTO {
	private Long id;
	private String nome;
	private String email;
	private String senha;
	private String cargo;
	private Departamento departamento;
	
	public static GestorDTO create(Gestor gestor) {
		ModelMapper modelMapper = new ModelMapper();
		return modelMapper.map(gestor, GestorDTO.class);
	}

}
