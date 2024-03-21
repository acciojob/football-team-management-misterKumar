package com.driver;

import java.util.Scanner;

public class FootballTeamManagementSystem {
	public static void main(String[] args) {
		Team<Player> teamManagementSystem = new Team<Player>();
        Scanner scanner = new Scanner(System.in);

        boolean exit = false;
        while (!exit) {
            System.out.println("\n1. Add Player");
            System.out.println("2. Remove Player");
            System.out.println("3. Display Players");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Player Name: ");
                    String playerName = scanner.nextLine();
                    System.out.print("Enter Jersey Number: ");
                    int jerseyNumber = scanner.nextInt();
                    teamManagementSystem.addPlayer(new Player(playerName, jerseyNumber));
                    break;

                case 2:
                    System.out.print("Enter Player Name to remove: ");
                    String playerToRemove = scanner.nextLine();
                    teamManagementSystem.removePlayer(playerToRemove);
                    break;

                case 3:
                    teamManagementSystem.displayPlayers();
                    break;

                case 4:
                    exit = true;
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        System.out.println("Exiting Football Team Management System.");
        scanner.close();
    }
}
