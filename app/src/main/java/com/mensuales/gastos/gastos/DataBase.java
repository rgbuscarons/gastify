package com.mensuales.gastos.gastos;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Roger on 16/04/2016.
 */
public class DataBase {

    Connection con = null;

    String host = "jdbc:derby://www.db4free.net/gastos";
    String username="ruch";
    String password="Ruch6699";
    String dbName="gastos";

    public DataBase(){
        ini();
    }

    public void ini(){
        try {
            Connection con = DriverManager.getConnection( this.host, this.username, this.password );
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void guardarLimite(float gasto, int fecha){
        Statement stmt = null;
        String query = "insert into " + this.dbName + "VALUES "+gasto+","+fecha;
        try {
            stmt = con.createStatement();
            stmt.executeQuery(query);
        } catch (SQLException e ) {
            e.printStackTrace();
        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void guardarGasto(){}

    public void getLimite(){
        Statement stmt = null;
        String query = "select * " +
                "from " + this.dbName + ".COFFEES";
        try {
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                String gasto = rs.getString("gasto");
                int fecha = rs.getInt("fecha");
                System.out.println(gasto + "\t" + fecha);
            }
        } catch (SQLException e ) {
            e.printStackTrace();
        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void getGasto(){}

}
