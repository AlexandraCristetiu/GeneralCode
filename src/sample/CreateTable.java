package sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

    private Connection connect(){
        // connect to the database

        Connection conn = null;

        try {
            conn = DriverManager.getConnection(ApplicationConstants.DB_CONNECTION_URL);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return conn;
    }
    private void createTable (String sql) {

        try{
            Connection conn = this.connect();
            // the query I want to feed the sql query to
            Statement statement = conn.createStatement();
            // executed on the db defined by the connection
            statement.execute(sql);
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }

    }
    private void createWantedTable(){
        String sql = "CREATE TABLE IF NOT EXISTS " +ApplicationConstants.TABLE_WANTED_NAME+
                "(" +
                ApplicationConstants.TABLE_NAME_FIRST_COLUMN + " TEXT UNIQUE NOT NULL," +
                ApplicationConstants.TABLE_NAME_SECOND_COLUMN + " TEXT NOT NULL" +
                ApplicationConstants.TABLE_NAME_THIRD_COLUMN + " TEXT NOT NULL" +
                ApplicationConstants.TABLE_NAME_FOURTH_COLUMN + " TEXT NOT NULL" +
                ");";
        createTable(sql);
    }

    public void  createAllTables(){
        createWantedTable();
            }

}
