package com.gxg.tools;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DbManager {
    private String diver = "com.mysql.jdbc.Driver";
    private String url = "jdbc:mysql://localhost:3306/jdbc";
    private String username = "root";
    private String password = "1111";
    public Connection conn = null;
    public Statement statement = null;
    public ResultSet resultSet = null;
    public DbManager(){

    }
    public Connection getConnection(){
        try {
            Class.forName(diver);
            System.out.println("加载驱动成功");
            conn = DriverManager.getConnection(url,username,password);
            return conn;
        }catch (Exception e){
            e.printStackTrace();
        }
        return conn;
    }
    public ResultSet queryDBFunction(String sql){
        try{
            conn = this.getConnection();
            statement = conn.createStatement();
            resultSet = statement.executeQuery(sql);
            return resultSet;
        }catch (Exception e){
            e.printStackTrace();
        }
        return resultSet;
    }
    public void closeDb(){
        try{
            if (conn != null) {
                conn.close();
            }
            if (resultSet != null) {
                resultSet.close();
            }
            if (statement != null) {
                statement.close();
            }
        }catch (Exception e){
            System.err.println("数据库关闭失败");
            e.printStackTrace();
        }
    }

}
