package com.ponto.eletronico.services;

import java.util.Optional;

import com.ponto.eletronico.entity.Empresa;

public interface EmpresaServices {
	
	Optional<Empresa> buscarPorCnpj(String cnpj);
	
	Empresa persistir(Empresa empresa);
}
