package org.javalab.jdbcsampleapp;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Main {
    public static void main(String[] args) {
        try (Connection con = DatabaseConnection.getConnection()) {
            PreparedStatement st = con.prepareStatement("select * from actor");
            st.setFetchSize(12);
            ResultSet rs = st.executeQuery("select * from actor");
            System.out.println(rs.getFetchSize());
            while (rs.next()) {
                System.out.println(rs.getString(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
