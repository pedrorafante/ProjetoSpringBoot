package br.com.pedrorafante.dslist.repositories;

import br.com.pedrorafante.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
