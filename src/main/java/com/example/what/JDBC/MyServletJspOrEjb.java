package com.example.what.JDBC;

import javax.naming.InitialContext;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
/*
* 连接池
* */
public class MyServletJspOrEjb {
    public void doSomething() throws Exception{
        InitialContext ctx = new InitialContext();
        DataSource ds = (DataSource)ctx.lookup("java:comp/env/jdbc/MySQLDB");
        Connection conn = null;
        Statement stmt = null;
        try{
            conn  = ds.getConnection();
            stmt = conn.createStatement();
            stmt.execute("SOME SQL QUERY");

            stmt.close();
            stmt = null;

            conn.close();
            conn = null;
        }finally{
            if (stmt != null) {
                try{
                    stmt.close();
                }catch(SQLException sqlex){

                }
                stmt = null;
            }
            if (conn != null){
                try{
                    conn.close();
                }catch (SQLException sqlex){

                }
                conn = null;
            }
        }
    }


}
