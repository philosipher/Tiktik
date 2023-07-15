package br.com.PublicPlayer.player;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "usuario")
@Entity(name = "player")
public class Player {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id;

	private String login;
	private String senha;

	public Integer age;
	public String nome;

	public String jogos;
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
	
	public Player(Long id, String login, String senha, Integer age, String nome, String jogos, String social_media) {
		
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
	
	public void setId(Long id) {
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
