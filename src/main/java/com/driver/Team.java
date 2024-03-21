package com.driver;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Team<T extends Player> {
	private List<T> players;

    public Team() {
        // your code goes here
    }

    public void addPlayer(T player) {
       // your code goes here
    }
    
    public List<T> getPlayers() {
    	// your code goes here
        return players;
    }

    public void removePlayer(String playerName) {
       // your code goes here
        System.out.println("Player not found.");
    }

    public void displayPlayers() {
        // your code goes here
    }
}
