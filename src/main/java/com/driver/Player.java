package com.driver;

public class Player {
	private String playerName;
    private int jerseyNumber;

    public Player(String playerName, int jerseyNumber) {
       // your code goes here
    }

    public String getPlayerName() {
    	// your code goes here
        return playerName;
    }

    public int getJerseyNumber() {
    	// your code goes here
        return jerseyNumber;
    }

    @Override
    public String toString() {
    	// your code goes here
        return "Player [Name: " + playerName + ", Jersey Number: " + jerseyNumber + "]";
    }
}
