package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    // реализуйте настройку соеденения с БД
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/1_preproject";
    private static final String USER_NAME = "root";
    private static final String PSSWORD = "barsik123";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName(DRIVER);
            System.out.println("Connection is ok");
            connection = DriverManager.getConnection(URL, USER_NAME, PSSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }
}
