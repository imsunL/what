package com.example.what.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCTest {

    //数据库连接地址
    public final static String URL = "jdbc:mysql://localhost:3306/JDBCdb";
    //用户名
    public final static String USERNAME = "root";
    //密码
    public final static String PASSWORD = "smyh";
    //驱动类
    public final static String DRIVER = "com.mysql.jdbc.Driver";


    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //insert(p);
        //update(p);
        //delete(3);
        insertAndQuery();
    }


    //方法：使用PreparedStatement插入数据、更新数据
    public static void insertAndQuery(){
        Connection conn = null;
        try {
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            String sql1 = "insert into user(name,pwd)values(?,?)";
            String sql2 = "update user set pwd=? where name=?";
            PreparedStatement ps = conn.prepareStatement(sql1);
            ps.setString(1, "smyhvae");
            ps.setString(2, "007");
            ps.executeUpdate();

            ps = conn.prepareStatement(sql2);
            ps.setString(1, "008");
            ps.setString(2, "smyh");
            ps.executeUpdate();

            ps.close();
            conn.close();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
