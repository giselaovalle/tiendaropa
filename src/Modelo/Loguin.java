/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Vista.MDISistemaCliente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;



public class Loguin {
    
    MDISistemaCliente fr = new MDISistemaCliente();
    
    private String usuario;
    private String contraseña;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    public void buscarLoguin() {

        try {

            PreparedStatement sql = ConexionDB.conexion.prepareStatement("SELECT  nickUsuario , claveUsuario  FROM usuarios WHERE  nickUsuario = ? and claveUsuario = ? ");
            sql.setString(1, this.getUsuario());
            sql.setString(2, this.getContraseña());
            ResultSet rs = sql.executeQuery();
            System.out.println("1");

            while (rs.next()) {
            
                setUsuario(rs.getString("nickUsuario"));
                setContraseña(rs.getString("claveUsuario"));
               
                
                fr.setVisible(true);

            }

        } catch (SQLException ex) {
            System.err.println("error buscar al usuario en el loguin  :" + this.getClass().getSimpleName() + "  :  " + ex.getMessage());
        }

    }

    
}
