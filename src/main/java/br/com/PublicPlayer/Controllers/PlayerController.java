package br.com.PublicPlayer.Controllers;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.PublicPlayer.Models.Player;
import br.com.PublicPlayer.Repositories.PlayerRepository;

@RestController
@RequestMapping("play")
public class PlayerController {
	
	@Autowired
	private PlayerRepository repository;
	
	//Get de todos os players
	@GetMapping
	public List<Player> findAll(){
	    return repository.findAll();
	}
	
	//Get por ID
	@GetMapping("/{ID}")
	public Optional<Player> findByID(@PathVariable UUID ID) {
		return repository.findById(ID);
	}
	
	//Adicionar Valor na DB
	@PostMapping
	public ResponseEntity<Player> postAll(String login, String senha, Integer age, String nome, String jogos,	String social_media) {
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(new Player(login, senha, age, nome, jogos, social_media)));
	}
	
	//Alterar valores padrões
	@PutMapping("/Default{ID}")
	public void putPlayer(@PathVariable UUID ID, Integer age, String nome, String jogos, String social_media) {
		Player player = repository.getReferenceById(ID);
		player.PlayerRefactoryDefault(age, nome, jogos, social_media);
		repository.save(player);
	}
	
	//Alterar valores Importantes
	@PutMapping("/Important{ID}")
	public void putPlayer(@PathVariable UUID ID, String login, String senha) {
		Player player = repository.getReferenceById(ID);
		player.PlayerRefactoryImportant(login, senha);
		repository.save(player);
	}
	
	//Deletar Valor por ID
	@DeleteMapping("/{ID}")
	public void deletePlayer(@PathVariable UUID ID) {
		repository.deleteById(ID);
	}
}