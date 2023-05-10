package br.com.pedrorafante.dslist.repositories;

import br.com.pedrorafante.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
