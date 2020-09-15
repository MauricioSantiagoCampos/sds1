package com.devsuperior.dspesquisa.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dspesquisa.dto.GameDTO;
import com.devsuperior.dspesquisa.entities.Game;
import com.devsuperior.dspesquisa.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository repository;
	
	@Transactional(readOnly = true)
	public List<GameDTO> findAll() {
		List<Game> list = repository.findAll();
		
	return list.stream().map(x -> new GameDTO(x)).collect(Collectors.toList()); // transforma uma List<Game> em uma List<GameDTO>	
	
/**
 *  list.stream()  -- Transforma a lista que é uma Lista de Game em stream	
 *  .map(x -> new GameDTO(x))  -- Aplica a Transformação em casa elemento, transformando a stream em um GameDTO
 *  .collect(collectors.toList())  -- Transforma a stream em Lista
 */
		
	}

}
