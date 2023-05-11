package br.com.pedrorafante.dslist.services;

import br.com.pedrorafante.dslist.dto.GameDTO;
import br.com.pedrorafante.dslist.dto.GameMinDTO;
import br.com.pedrorafante.dslist.entities.Game;
import br.com.pedrorafante.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;


    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll(){
        return gameRepository.findAll().stream().map(GameMinDTO::new).toList();
    }

    @Transactional(readOnly = true)
    public GameDTO findById(Long id){
        Game game = gameRepository.findById(id).get();
        return new GameDTO(game);
    }
}
