package br.com.PublicPlayer.Services;

import org.springframework.stereotype.Service;

import br.com.PublicPlayer.Models.Player;
import br.com.PublicPlayer.Repositories.PlayerRepository;

@Service
public class PlayerService {

	final PlayerRepository playerRepository;
	
	public PlayerService(PlayerRepository PlayerRepository) {
		this.playerRepository = PlayerRepository;
	}

	public Object save(Player player) {
		return playerRepository.save(player);
	}
	
	
}
