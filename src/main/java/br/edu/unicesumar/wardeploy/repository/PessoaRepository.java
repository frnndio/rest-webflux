package br.edu.unicesumar.wardeploy.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import br.edu.unicesumar.wardeploy.document.Pessoa;

public interface PessoaRepository extends ReactiveMongoRepository<Pessoa, String> {

}
