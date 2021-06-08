package br.com.jmcmusicmattec.forum.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.jmcmusicmattec.forum.modelo.Topico;

public interface TopicoRepository extends JpaRepository<Topico, Long>{

	List<Topico> findByCursoNome(String nomeCurso);
}
