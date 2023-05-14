package br.com.pedrorafante.dslist.controllers;

import br.com.pedrorafante.dslist.dto.GameDTO;
import br.com.pedrorafante.dslist.dto.GameListDTO;
import br.com.pedrorafante.dslist.dto.GameMinDTO;
import br.com.pedrorafante.dslist.services.GameListService;
import br.com.pedrorafante.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @Autowired
    private GameService gameService;
    @GetMapping
    public List<GameListDTO> findAll(){
        return gameListService.findAll();
    }

    @GetMapping(value = "/{listId}/games")
    public List<GameMinDTO> findByList(@PathVariable  Long listId){
        return gameService.findByList(listId);
    }


}
