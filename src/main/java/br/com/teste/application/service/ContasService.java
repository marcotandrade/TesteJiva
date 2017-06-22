package br.com.teste.application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.teste.application.model.Conta;
import br.com.teste.application.repository.Contas;

@Service
public class ContasService {

	@Autowired
	private Contas contas;

	public List<Conta> listarContas() {
		return contas.findAll();
	}

	public void salvarConta(Conta conta) {
		contas.save(conta);
	}
	
	public void deletarConta(Long id) {
		contas.delete(id);
		
	}
	
	public Conta findOne(Long id){
		return contas.findOne(id);
	}
	
	
	
	
}

