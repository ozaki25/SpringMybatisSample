package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.domain.Player;
import com.example.mapper.PlayerMapper;

@Service
public class PlayerService {
    @Autowired
    private PlayerMapper playerMapper;

    @Transactional
    public List<Player> findAll() {
        return playerMapper.findAll();
    }

    @Transactional
    public Player findOne(Long id) {
        return playerMapper.findOne(id);
    }

    @Transactional
    public void save(Player player) {
        playerMapper.save(player);
    }

    @Transactional
    public void update(Player player) {
        playerMapper.update(player);
    }

    @Transactional
    public void delete(Long id) {
        playerMapper.delete(id);
    }
}
