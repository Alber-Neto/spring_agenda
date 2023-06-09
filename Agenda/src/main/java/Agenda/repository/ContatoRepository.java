package Agenda.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Agenda.model.Contato;

@Repository
public interface ContatoRepository extends JpaRepository<Contato,Long>{
	List<Contato> findByNome(String nome);
}
