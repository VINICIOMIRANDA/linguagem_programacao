package br.edu.ads.lpii.lista_contatos_jpa;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface OperacaoRepository extends CrudRepository<Contato,Long> {
  List<Contato> findAll();

}
    
