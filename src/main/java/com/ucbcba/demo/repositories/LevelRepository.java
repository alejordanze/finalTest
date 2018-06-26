package com.ucbcba.demo.repositories;

import com.ucbcba.demo.entities.LevelRestaurant;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

@Transactional
public interface LevelRepository extends CrudRepository<LevelRestaurant,Integer> {

}
