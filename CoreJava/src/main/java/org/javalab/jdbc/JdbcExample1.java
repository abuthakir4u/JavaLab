package org.javalab.jdbc;

import java.sql.*;
//Sample JDBC code to connect to db and fetch rows
public class JdbcExample1 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/sakila"; //sakila is database name
        String username = "root";
        String password = "Bot$%^01";
        String query = "select * from actor where actor_id = ?";
        Connection con = DriverManager.getConnection(url, username, password);
        PreparedStatement st = con.prepareStatement(query);
        st.setInt(1, 200);
        ResultSet rs  = st.executeQuery();//should not pass query here
        rs.next();
        System.out.println(rs.getInt(1));
        st.close();
        con.close();
    }
}
