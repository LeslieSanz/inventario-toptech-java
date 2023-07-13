package modeloDAO;

import config.Conexion;
import java.util.ArrayList;
import misInterfaces.CategoriaProductoInterface;
import modelo.CategoriaProducto;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CategoriaProductoDAO implements CategoriaProductoInterface {
    Connection conn;
    Conexion con = new Conexion();
    CategoriaProducto c;
    Statement st;
    PreparedStatement ps;
    ResultSet rs;
    ArrayList<CategoriaProducto> lista = new ArrayList<>(); 
    
    @Override
    public boolean agregar(CategoriaProducto c) {
        try {
            String sql = "insert into categoria (cod_cat, nom_cat)"
                    + " values (?, ?)";
            conn = con.getConexion();
            ps = conn.prepareStatement(sql);
            ps.setString(1, c.getCodigo());
            ps.setString(2, c.getNombre());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CategoriaProductoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean eliminar(String codigo) {
        try {
            String sql = "delete from categoria where cod_cat = '"+codigo+"'";
            conn = con.getConexion();
            ps = conn.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CategoriaProductoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean modificar(CategoriaProducto c) {
       try {
            String sql = "update categoria set cod_cat=?, nom_cat=?"
                    + " where cod_cat = '"+c.getCodigo()+"'";
            conn = con.getConexion();
            ps = conn.prepareStatement(sql);
            ps.setString(1, c.getCodigo());
            ps.setString(2, c.getNombre());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CategoriaProductoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public ArrayList<CategoriaProducto> listarTodos() {
        try {
            String sql = "select * from categoria";            
            conn = con.getConexion();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                c = new CategoriaProducto();
                c.setCodigo(rs.getString("cod_cat"));
                c.setNombre(rs.getString("nom_cat"));
                lista.add(c);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CategoriaProductoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }

    @Override
    public CategoriaProducto listarUno(String codigo) {
        try {
            String sql = "select * from categoria where cod_cat = "+codigo;            
            conn = con.getConexion();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                c = new CategoriaProducto();
                c.setCodigo(rs.getString("cod_cat"));
                c.setNombre(rs.getString("nom_cat"));
             }
        } catch (SQLException ex) {
            Logger.getLogger(CategoriaProductoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return c;
    }   
}

