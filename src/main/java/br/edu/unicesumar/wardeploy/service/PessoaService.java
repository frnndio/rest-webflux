package br.edu.unicesumar.wardeploy.service;

import br.edu.unicesumar.wardeploy.document.Pessoa;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PessoaService {
	
	Flux<Pessoa> findAll();
	Mono<Pessoa> findById(String id);
	Mono<Pessoa> save(Pessoa pessoa);

}
