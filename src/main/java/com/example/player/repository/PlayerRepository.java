
// Write your code here

package com.example.player.repository;
import com.example.player.model.Player;

import java.util.ArrayList;

public interface PlayerRepository {

  void deletePlayer(int playerId);

  Player updatePlayer(int playerId,Player player);

  Player addPlayer(Player player);

  Player getPlayerById(int playerId);

  ArrayList<Player> getPlayers();
}