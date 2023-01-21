package com.game.service;

import com.game.entity.Player;

import java.util.List;

public interface PlayerService {
    List<Player> getAllPlayer();

    void addPlayer(Player player);

    void updatePlayer(Player player);

    void deletePlayer(Player player);//возможно удаление или по ID или по сущности

    Player getPlayerById(Long id);

    List<Player> getPlayerByFilter(String name);

    int countPlayerByFilter(String name);
}
