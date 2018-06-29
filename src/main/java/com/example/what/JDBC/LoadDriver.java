package com.example.what.JDBC;

import java.sql.*;
///数据库连接

public class LoadDriver {
    public static void main(String[] args){
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
        }catch (Exception ex){

        }
    }
    //private LoadDriver(){}
     public static Connection newInstance(String user,String password,String database) throws SQLException{
        if (user == null || password == null || database == null) {
            return null;
        }
        Connection conn =null;
        String urlModel = "jdbc:mysql://localhost/%s"+"user=root%s&password=root%s"+
                "&useUnicode=true&characterEncoding=utf8&characterSetResults=utf8&useSSL=false";
        try{
            conn =DriverManager.getConnection(
                    String.format(urlModel,database,user,password)
            );
        }catch (SQLException ex) {
            ex.printStackTrace();
            throw ex;
        }
        return conn;
    }
    /*Statement stmt = null;
    ResultSet rs = null;
    try{
        stmt = conn.createStatement();
        rs = stmt.executeQuery("SELECT foo FROM bar");
        if (stmt.execute("SELECT foo FROM bar")){
            rs = stmt.getResultSet();
        }
    }catch(SQLException ex){
        System.out.println("SQLException:"+ex.getMessage());
    }*/
}
