/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.devsuperior.dslist.controllers;

import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.dto.GameTDO;
import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.services.GameService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author agsjohn
 */

@RestController
@RequestMapping(value = "/games")
public class GameController {
    
    @Autowired
    private GameService gameService;
    
    @GetMapping(value = "/{id}")
    public GameTDO findById(@PathVariable Long id){
        GameTDO result = gameService.findById(id);
        return result;
    }
    
    @GetMapping
    public List<GameMinDTO> findAll(){
        List<GameMinDTO> result = gameService.findAll();
        return result;
    }
}
