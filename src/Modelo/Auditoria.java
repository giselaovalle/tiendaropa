
package Modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;


public class Auditoria {
    
    
  private int idAuditoria;
  private String descripcionAuditoria;
  private String fechaAuditoria;
  
  
    //obtener y colocar la clase de autoria
    public int getIdAuditoria() {
        return idAuditoria;
    }

    public void setIdAuditoria(int idAuditoria) {
        this.idAuditoria = idAuditoria;
    }

    public String getDescripcionAuditoria() {
        return descripcionAuditoria;
    }

    public void setDescripcionAuditoria(String descripcionAuditoria) {
        this.descripcionAuditoria = descripcionAuditoria;
    }

    public String getFechaAuditoria() {
        return fechaAuditoria;
    }

    public void setFechaAuditoria(String fechaAuditoria) {
        this.fechaAuditoria = fechaAuditoria;
    }
    
    
    
   //metodos de la clase autoria
    
    
    
    public Iterator<Auditoria> listar()
    {
        ArrayList<Auditoria> lasAuditorias = new ArrayList<>();
        try {
            PreparedStatement sql = ConexionDB.conexion.prepareStatement("SELECT * FROM auditoria");
            ResultSet rs = sql.executeQuery();
            Auditoria unaAuditoria ;
            while (rs.next()) {                
                unaAuditoria = new Auditoria();
                unaAuditoria.setIdAuditoria(     rs.getInt("idAuditoria"));
                unaAuditoria.setDescripcionAuditoria(   rs.getString("descripcionAuditoria"));
                unaAuditoria.setFechaAuditoria(  rs.getString("fechaAuditoria"));
                lasAuditorias.add(unaAuditoria);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "no se pudo listar");
        }
        
        if (lasAuditorias.isEmpty()){
            Auditoria miAuditoria = new Auditoria();
            miAuditoria.setDescripcionAuditoria("NO hay auditorias");
            
        }
        
        return lasAuditorias.iterator();
    
    }
    
  
    
    public Iterator<Auditoria> buscar(String busqueda)
    {
    ArrayList<Auditoria> lasAuditorias = new ArrayList<>();
    
        try {
            PreparedStatement sql = ConexionDB.conexion.prepareStatement("SELECT * FROM `auditoria` WHERE idAuditoria LIKE? or descripcionAuditoria LIKE?");
            sql.setString(1, "%"+busqueda+"%");
            sql.setString(2, "%"+busqueda+"%");
            ResultSet rs = sql.executeQuery();
            Auditoria unaAuditoria;
            while (rs.next()) {                
                unaAuditoria = new Auditoria();
                unaAuditoria.setIdAuditoria(rs.getInt("idAuditoria"));
                unaAuditoria.setDescripcionAuditoria(rs.getString("descripcionAuditoria"));
                unaAuditoria.setFechaAuditoria( rs.getString("fechaAuditoria"));
                lasAuditorias.add(unaAuditoria);
                        
            }
        } catch (SQLException e) {
            System.out.println("error en la busqueda     "+e.getMessage());
        }
    return lasAuditorias.iterator();   
    }
    
    
  
    //HASH CODE
    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Auditoria other = (Auditoria) obj;
        if (this.idAuditoria != other.idAuditoria) {
            return false;
        }
        return true;
    }
    
    
}
