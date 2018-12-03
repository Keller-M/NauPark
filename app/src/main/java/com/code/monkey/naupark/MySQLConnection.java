package com.code.monkey.naupark;
import android.widget.Toast;

import java.sql.*;
public class MySQLConnection {
    String userName;
    String password;
    String dbName;

    public MySQLConnection() {
        this.userName = "root";
        this.password = "";
        dbName = "//localhost:3306/park";
    }


    private ResultSet performQuery( String query )
    {
        Statement statement = null;
        ResultSet resultSet = null;
        Connection con      = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/park",
                                                  "root",
                                                  ""
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

