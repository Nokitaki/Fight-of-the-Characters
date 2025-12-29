/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Frames;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LeaderboardUpdate {
    
    public  void updateStage(String playerName, int newStage) {
        try {
            // Prepare the SQL statement to update the stage
            try ( // Establish connection to the database
                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/fotc_db", "root", "")) {
                // Prepare the SQL statement to update the stage
                String sql = "UPDATE leaderboard SET highest_stage = ? WHERE username = ?";
                PreparedStatement statement = connection.prepareStatement(sql);
                statement.setInt(1, newStage);
                statement.setString(2, playerName);
                // Execute the SQL statement
                int rowsUpdated = statement.executeUpdate();
                if (rowsUpdated > 0) {
                    System.out.println("Stage updated successfully for player: " + playerName);
                } else {
                    System.out.println("Player not found: " + playerName);
                }
                // Close the connection
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

