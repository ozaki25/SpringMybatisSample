package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.domain.Player;
import com.example.repository.PlayerRepository;

@Service
public class PlayerService {
    @Autowired
    private PlayerRepository playerRepository;

    @Transactional
    public List<Player> findAll() {
        return playerRepository.findAll();
    }

    @Transactional
    public Player findOne(Long id) {
        return playerRepository.findOne(id);
    }

    @Transactional
    public void save(Player player) {
        playerRepository.save(player);
    }

    @Transactional
    public void update(Player player) {
        playerRepository.save(player);
    }

    @Transactional
    public void delete(Long id) {
        playerRepository.delete(id);
    }
}
