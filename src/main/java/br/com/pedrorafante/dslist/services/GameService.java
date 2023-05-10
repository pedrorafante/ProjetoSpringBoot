package br.com.pedrorafante.dslist.services;

import br.com.pedrorafante.dslist.dto.GameMinDTO;
import br.com.pedrorafante.dslist.entities.Game;
import br.com.pedrorafante.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;


    public List<Game> findAll(){
        return gameRepository.findAll();
    }
}
