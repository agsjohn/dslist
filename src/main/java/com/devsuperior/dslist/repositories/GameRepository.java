/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.devsuperior.dslist.repositories;

import com.devsuperior.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author agsjohn
 */
public interface GameRepository extends JpaRepository<Game, Long>{
}
