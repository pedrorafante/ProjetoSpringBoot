package br.com.pedrorafante.dslist.dto;

import br.com.pedrorafante.dslist.entities.Game;
import br.com.pedrorafante.dslist.entities.GameList;

public record GameListDTO(Long id, String name) {

    public GameListDTO(GameList gameList) {
        this(gameList.getId(), gameList.getName());
    }
}
