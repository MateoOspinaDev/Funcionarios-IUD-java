package model;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class SqlConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/recursoshumanosiudigital";
    private static final String USUARIO="root";
    private static final String PASSWORD="";
    
    private Connection con;

    public SqlConnection() {
        try {
            con = DriverManager.getConnection(URL, USUARIO, PASSWORD);
            con.createStatement();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            //TODO:Crear avisos graficos por errore
        }
    }

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }
    
}
