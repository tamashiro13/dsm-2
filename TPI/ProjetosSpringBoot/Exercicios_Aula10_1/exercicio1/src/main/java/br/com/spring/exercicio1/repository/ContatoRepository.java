package br.com.spring.exercicio1.repository;

import br.com.spring.exercicio1.model.Contato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContatoRepository extends JpaRepository<Contato, Integer> {
}
