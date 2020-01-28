package com.ponto.eletronico.services.implement;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.ponto.eletronico.entity.Empresa;
import com.ponto.eletronico.repositories.EmpresaRepository;
import com.ponto.eletronico.services.EmpresaServices;

public class EmpresaServicesImplement implements EmpresaServices{
	
	@Autowired
	private EmpresaRepository empresaRepository;
	
	private static final Logger logger = LoggerFactory.getLogger(EmpresaServicesImplement.class);
	
	@Override
	public Optional<Empresa> buscarPorCnpj(String cnpj) {
		logger.info("Buscando uma empresa para o cnpj {}", cnpj);
		return Optional.ofNullable(empresaRepository.findByCnpj(cnpj)); 
	}

	@Override
	public Empresa persistir(Empresa empresa) {
		logger.info("Persistindo empresa {} ", empresa);
		return this.empresaRepository.save(empresa);
	}

}
