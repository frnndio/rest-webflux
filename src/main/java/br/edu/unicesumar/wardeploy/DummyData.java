package br.edu.unicesumar.wardeploy;

import java.util.UUID;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import br.edu.unicesumar.wardeploy.document.Pessoa;
import br.edu.unicesumar.wardeploy.repository.PessoaRepository;
import reactor.core.publisher.Flux;

@Component
public class DummyData implements CommandLineRunner {

	private final PessoaRepository pessoaRepository;

	public DummyData(PessoaRepository pessoaRepository) {
		this.pessoaRepository = pessoaRepository;
	}

	@Override
	public void run(String... args) throws Exception {
		pessoaRepository.deleteAll().thenMany(
				Flux.just("Ana", "Fernando", "Juliano", "Lucas")
				.map(nome -> new Pessoa(UUID.randomUUID().toString(), nome))
				.flatMap(pessoaRepository::save))
		.subscribe(System.out::println);
				
	}

}
