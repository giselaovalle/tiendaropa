package Modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

public class Usuario {

    private int idUsuario;
    private String nombreUsuario;
    private String cedulaUsuario;
    private String correoUsuario;
    private String telefonoUsuario;
    private String contrasenaUsuario;
    private int rolUsuario;

    //METODOS GET Y SET
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getCedulaUsuario() {
        return cedulaUsuario;
    }

    public void setCedulaUsuario(String cedulaUsuario) {
        this.cedulaUsuario = cedulaUsuario;
    }

    public String getCorreoUsuario() {
        return correoUsuario;
    }

    public void setCorreoUsuario(String correoUsuario) {
        this.correoUsuario = correoUsuario;
    }

    public String getTelefonoUsuario() {
        return telefonoUsuario;
    }

    public void setTelefonoUsuario(String telefonoUsuario) {
        this.telefonoUsuario = telefonoUsuario;
    }

    public String getContrasenaUsuario() {
        return contrasenaUsuario;
    }

    public void setContrasenaUsuario(String contrasenaUsuario) {
        this.contrasenaUsuario = contrasenaUsuario;
    }

    public int getRolUsuario() {
        return rolUsuario;
    }

    public void setRolUsuario(int rolUsuario) {
        this.rolUsuario = rolUsuario;
    }

  
    public Iterator<Usuario> listar() {
        ArrayList<Usuario> losUsuarios = new ArrayList<>();

        try {
            PreparedStatement sql = ConexionDB.conexion.prepareStatement("SELECT * FROM usuario");
            ResultSet rs = sql.executeQuery();
            Usuario unUsuario;
            while (rs.next()) {
                unUsuario = new Usuario();
                unUsuario.setIdUsuario(rs.getInt("idUsuario"));
                unUsuario.setNombreUsuario(rs.getString("nombreUsuario"));
                unUsuario.setCedulaUsuario(rs.getString("cedulaUsuario"));
                unUsuario.setCorreoUsuario(rs.getString("correoUsuario"));
                unUsuario.setTelefonoUsuario(rs.getString("telefonoUsuario"));
                unUsuario.setContrasenaUsuario(rs.getString("contrasenaUsuario"));
                losUsuarios.add(unUsuario);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "no se ha podido listar");
            System.out.println("error  " + e.getMessage());
        }

        if (losUsuarios.isEmpty()) {
            Usuario miUsuario = new Usuario();
            miUsuario.setNombreUsuario("No hay usuarios");
        }
        return losUsuarios.iterator();

    }

   
    public void insertar() {
        try {
            if (this.getNombreUsuario().isEmpty() || this.getCedulaUsuario().isEmpty() || this.getCorreoUsuario().isEmpty()) {
                JOptionPane.showMessageDialog(null, "debe llenar todos los campos");
            } else {
                PreparedStatement sql = ConexionDB.conexion.prepareStatement("INSERT INTO `usuario` ( `nombreUsuario`, `cedulaUsuario`, `correoUsuario`, `telefonoUsuario`, `contrasenaUsuario`,rolUsuario) VALUES (?,?,?,?,SHA(?),2)");
                PreparedStatement auditoria = ConexionDB.conexion.prepareStatement("INSERT INTO `auditoria`( `descripcionAuditoria`, `fechaAuditoria`) VALUES ('Se Insertó Usuario',null)");
                sql.setString(1, this.getNombreUsuario());
                sql.setString(2, this.getCedulaUsuario());
                sql.setString(3, this.getCorreoUsuario());
                sql.setString(4, this.getTelefonoUsuario());
                sql.setString(5, this.getContrasenaUsuario());
                sql.executeUpdate();
                auditoria.executeUpdate();
                JOptionPane.showMessageDialog(null, "Usuario Insertado");
                System.out.println("" + auditoria);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al insertar");
            System.out.println("no se ha ingresado por   " + e.getMessage());
        }

    }


    public void modificar() {
        try {
            if (this.getNombreUsuario().isEmpty() || this.getCedulaUsuario().isEmpty() || this.getCorreoUsuario().isEmpty()) {
                JOptionPane.showMessageDialog(null, "debe llenar todos los campos");
            } else {
                PreparedStatement sql = ConexionDB.conexion.prepareStatement("UPDATE `usuario` SET `nombreUsuario`=?,`cedulaUsuario`=?,`correoUsuario`=?,`telefonoUsuario`=?,`contrasenaUsuario`=? WHERE `idUsuario`=?");
                sql.setString(1, this.getNombreUsuario());
                sql.setString(2, this.getCedulaUsuario());
                sql.setString(3, this.getCorreoUsuario());
                sql.setString(4, this.getTelefonoUsuario());
                sql.setString(5, this.getContrasenaUsuario());
                sql.setInt(6, this.getIdUsuario());
                sql.executeUpdate();
                JOptionPane.showMessageDialog(null, "Usuario Modificado");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erroe al modificar");
            System.out.println("no se ha modificado por   " + e.getMessage());
        }
    }

  
    public void eliminar() {
        try {
            PreparedStatement sql = ConexionDB.conexion.prepareStatement("DELETE FROM `usuario` WHERE `idUsuario`=?");
            sql.setInt(1, this.getIdUsuario());
            sql.executeUpdate();
            JOptionPane.showMessageDialog(null, "Usuario Eliminado");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR al eliminar ");
        }
    }
  

    public Iterator<Usuario> buscar(String busqueda) {
        ArrayList<Usuario> losUsuarios = new ArrayList<>();
        try {
            PreparedStatement sql = ConexionDB.conexion.prepareStatement("SELECT * FROM `usuario` WHERE idUsuario LIKE? OR  nombreUsuario LIKE?or cedulaUsuario LIKE? OR correoUsuario LIKE? OR telefonoUsuario LIKE? or contrasenaUsuario LIKE?");
            sql.setString(1, "%" + busqueda + "%");
            sql.setString(2, "%" + busqueda + "%");
            sql.setString(3, "%" + busqueda + "%");
            sql.setString(4, "%" + busqueda + "%");
            sql.setString(5, "%" + busqueda + "%");
            sql.setString(6, "%" + busqueda + "%");

            ResultSet rs = sql.executeQuery();

            Usuario unUsuario;
            while (rs.next()) {
                unUsuario = new Usuario();
                unUsuario.setIdUsuario(rs.getInt("idUsuario"));
                unUsuario.setNombreUsuario(rs.getString("nombreUsuario"));
                unUsuario.setCedulaUsuario(rs.getString("cedulausuario"));
                unUsuario.setCorreoUsuario(rs.getString("correoUsuario"));
                unUsuario.setTelefonoUsuario(rs.getString("telefonoUsuario"));
                unUsuario.setContrasenaUsuario(rs.getString("contrasenaUsuario"));

                losUsuarios.add(unUsuario);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR al buscar");
            System.out.println("error  " + e.getMessage());
            System.out.println(losUsuarios);
        }
        return losUsuarios.iterator();
    }

  
    @Override
    public int hashCode() {
        int hash = 7;
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
        final Usuario other = (Usuario) obj;
        if (this.idUsuario != other.idUsuario) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombreUsuario=" + nombreUsuario + '}';
    }

    public boolean login(Usuario usr) {
        PreparedStatement ps = null;
        ResultSet rs = null;
       

        String sql = "SELECT `idUsuario`, `nombreUsuario`, `cedulaUsuario`, `correoUsuario`, `telefonoUsuario`, `contrasenaUsuario`, `rolUsuario` FROM `usuario` WHERE `correoUsuario`= ? LIMIT 1";

        try {
            PreparedStatement auditoria = ConexionDB.conexion.prepareStatement("INSERT INTO `auditoria`( `descripcionAuditoria`, `fechaAuditoria`) VALUES ('Usuario inicio sesion',null)");
            auditoria.executeUpdate();
            ps.setString(2, usr.getNombreUsuario());
            rs = ps.executeQuery();

            if (rs.next()) {
                if (usr.getContrasenaUsuario().equals(rs.getString(6))) {
                    usr.setIdUsuario(rs.getInt(1));
                    usr.setNombreUsuario(rs.getString(2));
                    usr.setRolUsuario(rs.getInt(7));
                    return true;
                } else {
                    return false;
                }
            }

            return false;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    }

}
