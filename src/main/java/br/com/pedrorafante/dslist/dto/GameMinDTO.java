package br.com.pedrorafante.dslist.dto;

import br.com.pedrorafante.dslist.entities.Game;
import br.com.pedrorafante.dslist.projections.GameMinProjection;

public record GameMinDTO (Long id, String title, Integer year, String imgUrl, String shortDescription) {

    public GameMinDTO(Game game) {
        this(game.getId(), game.getTitle(), game.getYear(), game.getImgUrl(), game.getShortDescription());
    }

    public GameMinDTO(GameMinProjection gameMinProjection){
        this(gameMinProjection.getId(), gameMinProjection.getTitle(), gameMinProjection.getYear(), gameMinProjection.getImgUrl(), gameMinProjection.getShortDescription());
    }
}