package org.javalab.jdbc;

import java.sql.*;
//Sample code to insert and read data from table with JDBC + DAO
public class JdbcExample2 {
    public static void main(String[] args) {
        StudentDAO dao = new StudentDAO();
        //Adding student into table
        dao.connect();
        Student s = new Student();
        s.rollno = 10;
        s.sname = "Igsat";
        dao.addStudent(s);

        //Reading a student from table
        dao.connect();
        Student s1 = dao.getStudent(10);
        System.out.println(s1.sname);
    }
}

class StudentDAO {
    Connection con = null;
    public void connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/sakila"; //sakila is database name
            String username = "root";
            String password = "Bot$%^01";
            this.con = DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e);
        }
    }
    public Student getStudent(int rollno) {
        Student s = new Student();
        s.rollno = rollno;
        String query = "select rollno, sname from student where rollno = ?";
        try {
            PreparedStatement st = con.prepareStatement(query);
            st.setInt(1, rollno);
            ResultSet rs = st.executeQuery();//should not pass query here
            rs.next();
            s.sname = rs.getString(2);
            st.close();
            con.close();
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e);
        }
        return s;
    }
    public void addStudent(Student s) {
        String query = "insert into student values (?, ?)";
        try {
            PreparedStatement st = con.prepareStatement(query);
            st.setInt(1, s.rollno);
            st.setString(2, s.sname);
            int result = st.executeUpdate();
            System.out.println("Affected rows: " + result);
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e);
        }
    }
}
class Student {
    int rollno;
    String sname;
}