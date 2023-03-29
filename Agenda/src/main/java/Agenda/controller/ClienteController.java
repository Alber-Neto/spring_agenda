package Agenda.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import Agenda.model.Contato;
import Agenda.repository.ContatoRepository;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
	
	@Autowired
	private ContatoRepository ContatoRepository;
	
	@GetMapping
	public List<Contato> contatos(){
		return ContatoRepository.findAll();
		
		
	}
	
	@PostMapping 
	@ResponseStatus(HttpStatus.CREATED)
	public Contato adicionar(@RequestBody Contato contato) {
		return ContatoRepository.save(contato);
	}
	
	@PostMapping(value ="/remover")
	public void remover(@RequestBody Contato contato) {
		ContatoRepository.delete(contato);
	}
	
	@PostMapping(value ="/alterar")
	public Contato alterar(@RequestBody Contato contato) {
		return ContatoRepository.saveAndFlush(contato);
	}
	
	@PostMapping(value ="/pesquisa")
	public List<Contato> pesquisa(@RequestBody String nome){
		return   ContatoRepository.findByNome(nome);
	}

}
