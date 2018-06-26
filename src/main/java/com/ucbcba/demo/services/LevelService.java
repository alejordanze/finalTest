package com.ucbcba.demo.services;

import com.ucbcba.demo.entities.LevelRestaurant;

import java.util.List;

public interface LevelService {

    Iterable<LevelRestaurant> listAllLevels();

    void save (LevelRestaurant level);

    LevelRestaurant getLevel(Integer id);

    void deleteRating(Integer id);
}
