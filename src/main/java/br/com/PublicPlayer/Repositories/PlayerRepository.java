package br.com.PublicPlayer.Repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.PublicPlayer.Models.Player;

public interface PlayerRepository extends JpaRepository<Player, UUID> {

}