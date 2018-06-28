package com.example.what.JDBC;

import javax.naming.InitialContext;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.Statement;

public class MyServletJspOrEjb {
    public void doSomething() throws Exception{
        InitialContext ctx = new InitialContext();
        DataSource ds = (DataSource)ctx.lookup("java:comp/env/jdbc/MySQLDB");
        Connection conn = null;
        Statement stmt = null;
    }
    try{
        conn  = ds.getConnection();
        stmt = conn.creatStatement();
        stmt.execute("SOME SQL QUERY");

        stmt.close();
        stmt = null;

        conn.close();
        conn = null;
    }finally{
        if (stmt != null) {
            try{
                stmt.close();
            }catch(sqlexception sqlex){

            }
            stmt = null;
        }
        if (conn != null){
            try{
                conn.close();
            }catch (sqlexception sqlex){

            }
            conn = null;
        }
    }

}
