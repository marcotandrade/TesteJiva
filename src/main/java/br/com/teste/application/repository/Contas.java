package br.com.teste.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.teste.application.model.Conta;

public interface Contas extends JpaRepository<Conta	, Long>{

}
