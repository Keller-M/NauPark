package com.code.monkey.naupark;
import java.sql.*;

public class MySQLConnection {
    String userName;
    String password;
    String dbName;

    public MySQLConnection( String userName, String password ) {
        this.userName = userName;
        this.password = password;
        dbName = "//localhost:3306/Park";
    }


    private ResultSet performQuery( String query )
    {
        Statement statement = null;
        ResultSet resultSet = null;
        Connection con      = null;
        try {
            con = DriverManager.getConnection("jdbc::mysql" + dbName,
                                                  userName,
                                                  password

            );
            statement = con.createStatement();
            resultSet = statement.executeQuery( query );
        } catch (Exception e) {
            return null;
        }
        return resultSet;
    }


    public ResultSet updateDatabase(String query)
    {
            return performQuery( query );
    }

    public ResultSet retrieveData(String query )
    {
        return performQuery( query ) ;
    }
}
