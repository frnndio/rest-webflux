package br.edu.unicesumar.wardeploy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.edu.unicesumar.wardeploy.document.Pessoa;
import br.edu.unicesumar.wardeploy.service.PessoaService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class PessoaController {
	
	@Autowired
	private PessoaService service;
	
	@GetMapping(value="/pessoa")
	public Flux<Pessoa> getAll() {
		return service.findAll();
	}
	
	@GetMapping(value="/pessoa/{id}")
	public Mono<Pessoa> getById(@PathVariable String id) {
		return service.findById(id);
	}
	
	@PostMapping(value="/pessoa")
	public Mono<Pessoa> save(@RequestBody Pessoa pessoa) {
		return service.save(pessoa);
	}
	
}
