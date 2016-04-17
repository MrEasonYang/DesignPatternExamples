package com.designpattern.template;

import java.sql.*;

/**
 * Created by Eason Yang on 12/10/2015.
 */
public class CustomerDataObject implements DataObject {
    static final String JDBC_DRIVER="com.mysql.jdbc.Driver";
    static final String DB_URL="jdbc:mysql://localhost:3306/mydata?useUnicode=true&characterEncoding=UTF-8&zeroDateTimeBehavior=convertToNull";

    static final String USER = "root";
    static final String PASS = "root";

    private Connection connection = null;
    private Statement statement = null;
    private ResultSet resultSet = null;

    @Override
    public boolean connect() {
        try {
            Class.forName(JDBC_DRIVER);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("连接数据库失败1");
            return false;
        }

        try {
            connection = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("连接数据库成功");
        } catch (SQLException e) {
            System.out.println("连接数据库失败2");
            e.printStackTrace();
            return false;
        } finally {
            if(connection != null) {
                return true;
            } else {
                return false;
            }
        }
    }

    @Override
    public boolean select() {
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM USER");
            return true;
        } catch (SQLException e) {
            System.out.println("创建查询语句失败");
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean process() {
        try {
            System.out.println("读取数据成功，开始输出数据：");
            while( resultSet.next() ) {
                System.out.println(resultSet.getString(2));
            }
            System.out.println("数据输出结束");
            return true;
        } catch (SQLException e) {
            System.out.println("输出数据失败");
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean disconnect() {
        boolean result = false;
        if (statement != null) {
            try {
                statement.close();
                result = true;
            } catch (SQLException e) {
                System.out.println("关闭查询语句失败");
                e.printStackTrace();
                result = false;
            }
        }
        if (connection != null) {
            try {
                connection.close();
                result = true;
            } catch (SQLException e) {
                System.out.println("关闭数据库连接失败");
                e.printStackTrace();
                result = false;
            }
        }
        return result;
    }
}
