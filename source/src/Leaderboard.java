import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class Player {
    private String username;
    private int highestStage;

    public Player(String username) {
        this.username = username;
        this.highestStage = 1;
    }

    public String getUsername() {
        return username;
    }

    public int getHighestStage() {
        return highestStage;
    }

    public void setHighestStage(int stage) {
        if (stage > highestStage) {
            highestStage = stage;
        }
    }
}

public class Leaderboard {
    private Connection connection;

    public Leaderboard() {
        try {
            // Establish connection to the database
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/oopdb", "root", "");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void addPlayer(String username) {
        try {
            // Check if the player already exists in the database
            PreparedStatement checkStatement = connection.prepareStatement("SELECT * FROM leaderboard WHERE username = ?");
            checkStatement.setString(1, username);
            ResultSet resultSet = checkStatement.executeQuery();

            if (!resultSet.next()) {
                // Player doesn't exist, so insert a new record with highest_stage = 1
                PreparedStatement insertStatement = connection.prepareStatement("INSERT INTO leaderboard (username, highest_stage) VALUES (?, ?)");
                insertStatement.setString(1, username);
                insertStatement.setInt(2, 1); // Initialize highest stage to 1 for new players
                insertStatement.executeUpdate();
            } else {
                // Player already exists, do nothing
                System.out.println("Player already exists in the leaderboard.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private int getHighestStageByUsername(String username) {
        try {
            // Fetch the highest stage achieved by the player from the database
            PreparedStatement statement = connection.prepareStatement("SELECT highest_stage FROM leaderboard WHERE username = ?");
            statement.setString(1, username);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                return resultSet.getInt("highest_stage");
            } else {
                return 1; // Default to 1 if no record found
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return 1; // Default to 1 in case of an error
        }
    }

    public void updatePlayerStage(String username, int stage) {
        try {
            // Update player's highest stage in the database
            PreparedStatement statement = connection.prepareStatement("UPDATE leaderboard SET highest_stage = ? WHERE username = ?");
            statement.setInt(1, stage);
            statement.setString(2, username);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void displayLeaderboard() {
        try {
            // Fetch leaderboard data from the database and display it
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM leaderboard ORDER BY highest_stage DESC");
            System.out.println("Leaderboard:");
            while (resultSet.next()) {
                String username = resultSet.getString("username");
                int highestStage = resultSet.getInt("highest_stage");
                System.out.println(username + ": Stage " + highestStage);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
