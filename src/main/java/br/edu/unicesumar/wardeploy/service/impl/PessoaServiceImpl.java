package br.edu.unicesumar.wardeploy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.unicesumar.wardeploy.document.Pessoa;
import br.edu.unicesumar.wardeploy.repository.PessoaRepository;
import br.edu.unicesumar.wardeploy.service.PessoaService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class PessoaServiceImpl implements PessoaService {
	
	@Autowired
	private PessoaRepository repository;

	@Override
	public Flux<Pessoa> findAll() {
		return repository.findAll();
	}

	@Override
	public Mono<Pessoa> findById(String id) {
		return repository.findById(id);
	}

	@Override
	public Mono<Pessoa> save(Pessoa pessoa) {
		return repository.save(pessoa);
	}

}
