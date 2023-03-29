package Agenda.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Agenda.model.Usuario;

public interface UsuarioRepository extends JpaRepository <Usuario,Long>{

}
