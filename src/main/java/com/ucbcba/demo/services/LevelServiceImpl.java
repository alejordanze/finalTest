package com.ucbcba.demo.services;

import com.ucbcba.demo.entities.LevelRestaurant;
import com.ucbcba.demo.repositories.CommentRepository;
import com.ucbcba.demo.repositories.LevelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LevelServiceImpl implements LevelService{

    private LevelRepository levelRepository;

    @Autowired
    @Qualifier(value = "levelRepository")
    public void setLevelRepository(LevelRepository levelRepository) {
        this.levelRepository = levelRepository;
    }


    @Override
    public Iterable<LevelRestaurant> listAllLevels() {
        return levelRepository.findAll();
    }

    @Override
    public void save(LevelRestaurant level) {
        levelRepository.save(level);
    }

    @Override
    public LevelRestaurant getLevel(Integer id) {
        return levelRepository.findOne(id);
    }

    @Override
    public void deleteRating(Integer id) {
        levelRepository.delete(id);
    }
}
