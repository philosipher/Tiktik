package br.com.PublicPlayer.Models;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "usuario")
@Entity(name = "player")
public class Player {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public UUID id;
	
	@Column(nullable = false, unique = true, length = 30)
	private String login;
	@Column(nullable = false, length = 30)
	private String senha;
	
	@Column(nullable = false)
	public Integer age;
	@Column(nullable = false, unique = false, length = 30)
	public String nome;

	@Column(nullable = true, unique = false, length = 60)
	public String jogos;
	@Column(nullable = true, unique = false, length = 60)
	public String social_media;

	public Player() {
		// TODO Auto-generated constructor stub
	}

	public Player(String login, String senha, Integer age, String nome, String jogos, String social_media) {

		setLogin(login);
		setSenha(senha);
		setAge(age);
		setNome(nome);
		setJogos(jogos);
		setSocial_media(social_media);
	}
	
	public Player(UUID id, String login, String senha, Integer age, String nome, String jogos, String social_media) {
		
		setId(id);
		setLogin(login);
		setSenha(senha);
		setAge(age);
		setNome(nome);
		setJogos(jogos);
		setSocial_media(social_media);
	}
	
	public void PlayerRefactoryDefault(Integer age, String nome, String jogos, String social_media) {
		
		setAge(age);
		setNome(nome);
		setJogos(jogos);
		setSocial_media(social_media);
		
	};
	
	public void PlayerRefactoryImportant(String login, String senha) {
		
		setLogin(login);
		setSenha(senha);
		
	};

	@Override
	public String toString() {
		return "{id=" + id + ", login=" + login + ", senha=" + senha + ", age=" + age + ", nome=" + nome + ", jogos="
				+ jogos + ", social_media=" + social_media + "}";
	}
	
	public void setId(UUID id) {
		this.id = id;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setJogos(String jogos) {
		this.jogos = jogos;
	}

	public void setSocial_media(String social_media) {
		this.social_media = social_media;
	}

}
