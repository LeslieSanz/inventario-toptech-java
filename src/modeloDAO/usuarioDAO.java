
package modeloDAO;

import config.Conexion;
import misInterfaces.UsuarioInterface;
import modelo.Usuario;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class usuarioDAO implements UsuarioInterface{

    Connection conn;
    Conexion con = new Conexion();
    Usuario u;
    PreparedStatement ps;
    Statement st;
    ResultSet rs;
    
    
    @Override
    public Usuario validarLogueo(String usu, String pas, String Tipo) {
        
        try {
            String sql = "Select * from usuarios where nomusu ='"+usu+"' and pasusu = '"+pas+"' and tipo = '"+Tipo+"'";
            conn = con.getConexion();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                u = new Usuario();
                u.setNombreUsuario(rs.getString("nomusu"));
                u.setContraseña(rs.getString("pasusu"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(usuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return u; 
        
    }
    public void registrarUsuario(String usu, String pas, String Tipo) {
        try {
        String sql = "INSERT INTO usuarios (nomusu, pasusu, tipo) VALUES (?, ?, ?)";
        conn = con.getConexion();
        ps = conn.prepareStatement(sql);
        ps.setString(1, usu);
        ps.setString(2, pas);
        ps.setString(3, Tipo);
        ps.executeUpdate();
    } catch (SQLException ex) {
        Logger.getLogger(usuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
    } finally {
        // Cerrar recursos (Statement, ResultSet, etc.) y la conexión
        try {
            if (ps != null) {
                ps.close();
            }
            if (rs != null) {
                rs.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(usuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }}
}
