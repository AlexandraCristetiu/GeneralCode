package sample;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class InsertData {

    private Connection connect() {
        // connect to the database

        Connection conn = null;

        try {
            conn = DriverManager.getConnection(ApplicationConstants.DB_CONNECTION_URL);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return conn;
    }


    public void insertData() {
        String sql = "INSERT INTO " + ApplicationConstants.TABLE_WANTED_NAME +
                "(" + ApplicationConstants.TABLE_NAME_FIRST_COLUMN + "," +
                ApplicationConstants.TABLE_NAME_SECOND_COLUMN + "," +
                ApplicationConstants.TABLE_NAME_THIRD_COLUMN + "," +
                ApplicationConstants.TABLE_NAME_FOURTH_COLUMN +
                ")" +
                "VALUES(?,?,?,?);";

        try {
            Connection conn = this.connect();
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, tableData.getFirstColumn);
            statement.setString(2, tableData.getSecondColumn);
            statement.setString(3, tableData.getThirdColumn);
            statement.setString(3, tableData.getFourthColumn);
            statement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}

