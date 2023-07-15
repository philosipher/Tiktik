package br.com.PublicPlayer.playerRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.PublicPlayer.player.Player;

public interface PlayerRepository extends JpaRepository<Player, Long> {

}