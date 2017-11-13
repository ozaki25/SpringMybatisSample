package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.domain.Player;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {

}
