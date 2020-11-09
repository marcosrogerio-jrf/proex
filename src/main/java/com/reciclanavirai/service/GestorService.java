package com.reciclanavirai.service;

import java.util.List;
import java.util.Optional;

import com.reciclanavirai.domain.Gestor;
import com.reciclanavirai.domain.dto.GestorDTO;

public interface GestorService {

	GestorDTO salvar(Gestor gestor);
	GestorDTO atualizar(Gestor gestor);
	void excluir(Long id);
	List<GestorDTO> listaGestores();
	Optional<GestorDTO> listarGestorPorId(Long id);
	GestorDTO autenticar(String email, String senha);
	void validarEmail(String email);
	
}
