package com.driver;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Team<T extends Player> {
	private List<T> players;

    public Team() {
        // your code goes here
        players=new ArrayList<>();
    }

    public void addPlayer(T player) {
       // your code goes here
        players.add(player);
    }
    
    public List<T> getPlayers() {
    	// your code goes here
        return players;
    }

    public void removePlayer(String playerName) {
       // your code goes here
        Iterator<T> iterator = players.iterator();
        while (iterator.hasNext()) {
            T player = iterator.next();
            if (player.getPlayerName().equalsIgnoreCase(playerName)) {
                iterator.remove();
                System.out.println("Player removed successfully.");
                return;
            }
        }
        System.out.println("Player not found.");
    }

    public void displayPlayers() {
        // your code goes here
        if (players.isEmpty()) {
            System.out.println("No players in the team.");
        } else {
            System.out.println("Players:");
            for (T player : players) {
                System.out.println("- " + player);
            }
        }
    }
}
